package firefly.grpc.modules;

import firefly.grpc.FireflyProto;
import firefly.grpc.FireflyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class FireflyClient {

    private final FireflyServiceGrpc.FireflyServiceStub asyncStub;

    public FireflyClient(String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        asyncStub = FireflyServiceGrpc.newStub(channel);
    }

    public void notifyFirefly(double flash) {
        FireflyProto.FireflyRequest request = FireflyProto.FireflyRequest.newBuilder().setFlash(flash).build();
        asyncStub.notifyFirefly(request, new StreamObserver<FireflyProto.FireflyReply>() {
            @Override
            public void onNext(FireflyProto.FireflyReply value) {
                System.out.println("Received reply: " + value.getReply());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Request completed");
            }
        });
    }
}
