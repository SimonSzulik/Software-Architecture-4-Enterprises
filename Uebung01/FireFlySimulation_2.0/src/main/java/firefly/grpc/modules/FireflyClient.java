package firefly.grpc.modules;

import firefly.grpc.FireflyProto;
import firefly.grpc.FireflyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class FireflyClient {

    private final List<FireflyServiceGrpc.FireflyServiceStub> asyncStubs;

    // Konstruktor, der eine Liste von Ports akzeptiert
    public FireflyClient(String host, List<Integer> ports) {
        asyncStubs = new java.util.ArrayList<>();

        for (int port : ports) {
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                    .usePlaintext()
                    .build();
            FireflyServiceGrpc.FireflyServiceStub asyncStub = FireflyServiceGrpc.newStub(channel);
            asyncStubs.add(asyncStub);
        }
    }

    // Notify-Methode, die die Nachricht an alle Ports sendet
    public void notifyFirefly(double flash) {
        FireflyProto.FireflyRequest request = FireflyProto.FireflyRequest.newBuilder().setFlash(flash).build();

        // Nachricht an alle Stubs (Ports) senden
        for (FireflyServiceGrpc.FireflyServiceStub asyncStub : asyncStubs) {
            asyncStub.notifyFirefly(request, new StreamObserver<FireflyProto.FireflyReply>() {
                @Override
                public void onNext(FireflyProto.FireflyReply value) {
                    // System.out.println("Received reply: " + value.getReply());
                }

                @Override
                public void onError(Throwable t) {
                    // t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    // System.out.println("Request completed");
                }
            });
        }
    }
}
