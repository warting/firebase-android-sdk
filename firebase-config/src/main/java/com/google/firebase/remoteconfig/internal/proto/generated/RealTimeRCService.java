// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RealTimeRemoteConfig.proto

package com.google.firebase.remoteconfig.internal.proto.generated;

/**
 * Protobuf service {@code remoteconfig.RealTimeRCService}
 */
public  abstract class RealTimeRCService
    implements com.google.protobuf.Service {
  protected RealTimeRCService() {}

  public interface Interface {
    /**
     * <code>rpc OpenFetchInvalidationStream(.remoteconfig.OpenFetchInvalidationStreamRequest) returns (stream .remoteconfig.OpenFetchInvalidationStreamResponse);</code>
     */
    public abstract void openFetchInvalidationStream(
        com.google.protobuf.RpcController controller,
        com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest request,
        com.google.protobuf.RpcCallback<com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new RealTimeRCService() {
      @java.lang.Override
      public  void openFetchInvalidationStream(
          com.google.protobuf.RpcController controller,
          com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest request,
          com.google.protobuf.RpcCallback<com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse> done) {
        impl.openFetchInvalidationStream(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.openFetchInvalidationStream(controller, (com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc OpenFetchInvalidationStream(.remoteconfig.OpenFetchInvalidationStreamRequest) returns (stream .remoteconfig.OpenFetchInvalidationStreamResponse);</code>
   */
  public abstract void openFetchInvalidationStream(
      com.google.protobuf.RpcController controller,
      com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest request,
      com.google.protobuf.RpcCallback<com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.google.firebase.remoteconfig.internal.proto.generated.RealTimeRemoteConfig.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.openFetchInvalidationStream(controller, (com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest)request,
          com.google.protobuf.RpcUtil.<com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.google.firebase.remoteconfig.internal.proto.generated.RealTimeRCService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void openFetchInvalidationStream(
        com.google.protobuf.RpcController controller,
        com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest request,
        com.google.protobuf.RpcCallback<com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse.class,
          com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse openFetchInvalidationStream(
        com.google.protobuf.RpcController controller,
        com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse openFetchInvalidationStream(
        com.google.protobuf.RpcController controller,
        com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.google.firebase.remoteconfig.internal.proto.generated.OpenFetchInvalidationStreamResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:remoteconfig.RealTimeRCService)
}

