package firefly.grpc.modules;

import firefly.grpc.FireflyProto;
import firefly.grpc.FireflyServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class FireflyServer {

    private final int port;
    private final Server server;

    public FireflyServer(int port) {
        this.port = port;
        this.server = ServerBuilder.forPort(port)
                .addService(new FireflyServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Server started on port " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.err.println("Usage: FireflyServer <port>");
            System.exit(1);
        }

        int port = Integer.parseInt(args[0]);
        FireflyServer server = new FireflyServer(port);
        server.start();
    }

    static class FireflyServiceImpl extends FireflyServiceGrpc.FireflyServiceImplBase {
        @Override
        public void notifyFirefly(FireflyProto.FireflyRequest request, StreamObserver<FireflyProto.FireflyReply> responseObserver) {
            // Verarbeite die Anfrage
            System.out.println("Received flash: " + request.getFlash());
            FireflyProto.FireflyReply reply = FireflyProto.FireflyReply.newBuilder().setReply(request.getFlash()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}
