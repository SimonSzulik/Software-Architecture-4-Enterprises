// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: firefly.proto

package firefly.grpc;

public final class FireflyProto {
  private FireflyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireflyRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireflyRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double flash = 1;</code>
     * @return The flash.
     */
    double getFlash();
  }
  /**
   * Protobuf type {@code FireflyRequest}
   */
  public static final class FireflyRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireflyRequest)
      FireflyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireflyRequest.newBuilder() to construct.
    private FireflyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireflyRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireflyRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return firefly.grpc.FireflyProto.internal_static_FireflyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return firefly.grpc.FireflyProto.internal_static_FireflyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              firefly.grpc.FireflyProto.FireflyRequest.class, firefly.grpc.FireflyProto.FireflyRequest.Builder.class);
    }

    public static final int FLASH_FIELD_NUMBER = 1;
    private double flash_ = 0D;
    /**
     * <code>double flash = 1;</code>
     * @return The flash.
     */
    @java.lang.Override
    public double getFlash() {
      return flash_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(flash_) != 0) {
        output.writeDouble(1, flash_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(flash_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, flash_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof firefly.grpc.FireflyProto.FireflyRequest)) {
        return super.equals(obj);
      }
      firefly.grpc.FireflyProto.FireflyRequest other = (firefly.grpc.FireflyProto.FireflyRequest) obj;

      if (java.lang.Double.doubleToLongBits(getFlash())
          != java.lang.Double.doubleToLongBits(
              other.getFlash())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FLASH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getFlash()));
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static firefly.grpc.FireflyProto.FireflyRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static firefly.grpc.FireflyProto.FireflyRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static firefly.grpc.FireflyProto.FireflyRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(firefly.grpc.FireflyProto.FireflyRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code FireflyRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireflyRequest)
        firefly.grpc.FireflyProto.FireflyRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return firefly.grpc.FireflyProto.internal_static_FireflyRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return firefly.grpc.FireflyProto.internal_static_FireflyRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                firefly.grpc.FireflyProto.FireflyRequest.class, firefly.grpc.FireflyProto.FireflyRequest.Builder.class);
      }

      // Construct using firefly.grpc.FireflyProto.FireflyRequest.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        flash_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return firefly.grpc.FireflyProto.internal_static_FireflyRequest_descriptor;
      }

      @java.lang.Override
      public firefly.grpc.FireflyProto.FireflyRequest getDefaultInstanceForType() {
        return firefly.grpc.FireflyProto.FireflyRequest.getDefaultInstance();
      }

      @java.lang.Override
      public firefly.grpc.FireflyProto.FireflyRequest build() {
        firefly.grpc.FireflyProto.FireflyRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public firefly.grpc.FireflyProto.FireflyRequest buildPartial() {
        firefly.grpc.FireflyProto.FireflyRequest result = new firefly.grpc.FireflyProto.FireflyRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(firefly.grpc.FireflyProto.FireflyRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.flash_ = flash_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof firefly.grpc.FireflyProto.FireflyRequest) {
          return mergeFrom((firefly.grpc.FireflyProto.FireflyRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(firefly.grpc.FireflyProto.FireflyRequest other) {
        if (other == firefly.grpc.FireflyProto.FireflyRequest.getDefaultInstance()) return this;
        if (other.getFlash() != 0D) {
          setFlash(other.getFlash());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 9: {
                flash_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private double flash_ ;
      /**
       * <code>double flash = 1;</code>
       * @return The flash.
       */
      @java.lang.Override
      public double getFlash() {
        return flash_;
      }
      /**
       * <code>double flash = 1;</code>
       * @param value The flash to set.
       * @return This builder for chaining.
       */
      public Builder setFlash(double value) {

        flash_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>double flash = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFlash() {
        bitField0_ = (bitField0_ & ~0x00000001);
        flash_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FireflyRequest)
    }

    // @@protoc_insertion_point(class_scope:FireflyRequest)
    private static final firefly.grpc.FireflyProto.FireflyRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new firefly.grpc.FireflyProto.FireflyRequest();
    }

    public static firefly.grpc.FireflyProto.FireflyRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireflyRequest>
        PARSER = new com.google.protobuf.AbstractParser<FireflyRequest>() {
      @java.lang.Override
      public FireflyRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<FireflyRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireflyRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public firefly.grpc.FireflyProto.FireflyRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FireflyReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireflyReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double reply = 1;</code>
     * @return The reply.
     */
    double getReply();
  }
  /**
   * Protobuf type {@code FireflyReply}
   */
  public static final class FireflyReply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireflyReply)
      FireflyReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireflyReply.newBuilder() to construct.
    private FireflyReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireflyReply() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireflyReply();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return firefly.grpc.FireflyProto.internal_static_FireflyReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return firefly.grpc.FireflyProto.internal_static_FireflyReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              firefly.grpc.FireflyProto.FireflyReply.class, firefly.grpc.FireflyProto.FireflyReply.Builder.class);
    }

    public static final int REPLY_FIELD_NUMBER = 1;
    private double reply_ = 0D;
    /**
     * <code>double reply = 1;</code>
     * @return The reply.
     */
    @java.lang.Override
    public double getReply() {
      return reply_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(reply_) != 0) {
        output.writeDouble(1, reply_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(reply_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, reply_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof firefly.grpc.FireflyProto.FireflyReply)) {
        return super.equals(obj);
      }
      firefly.grpc.FireflyProto.FireflyReply other = (firefly.grpc.FireflyProto.FireflyReply) obj;

      if (java.lang.Double.doubleToLongBits(getReply())
          != java.lang.Double.doubleToLongBits(
              other.getReply())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REPLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getReply()));
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static firefly.grpc.FireflyProto.FireflyReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static firefly.grpc.FireflyProto.FireflyReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static firefly.grpc.FireflyProto.FireflyReply parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(firefly.grpc.FireflyProto.FireflyReply prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code FireflyReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireflyReply)
        firefly.grpc.FireflyProto.FireflyReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return firefly.grpc.FireflyProto.internal_static_FireflyReply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return firefly.grpc.FireflyProto.internal_static_FireflyReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                firefly.grpc.FireflyProto.FireflyReply.class, firefly.grpc.FireflyProto.FireflyReply.Builder.class);
      }

      // Construct using firefly.grpc.FireflyProto.FireflyReply.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        reply_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return firefly.grpc.FireflyProto.internal_static_FireflyReply_descriptor;
      }

      @java.lang.Override
      public firefly.grpc.FireflyProto.FireflyReply getDefaultInstanceForType() {
        return firefly.grpc.FireflyProto.FireflyReply.getDefaultInstance();
      }

      @java.lang.Override
      public firefly.grpc.FireflyProto.FireflyReply build() {
        firefly.grpc.FireflyProto.FireflyReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public firefly.grpc.FireflyProto.FireflyReply buildPartial() {
        firefly.grpc.FireflyProto.FireflyReply result = new firefly.grpc.FireflyProto.FireflyReply(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(firefly.grpc.FireflyProto.FireflyReply result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.reply_ = reply_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof firefly.grpc.FireflyProto.FireflyReply) {
          return mergeFrom((firefly.grpc.FireflyProto.FireflyReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(firefly.grpc.FireflyProto.FireflyReply other) {
        if (other == firefly.grpc.FireflyProto.FireflyReply.getDefaultInstance()) return this;
        if (other.getReply() != 0D) {
          setReply(other.getReply());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 9: {
                reply_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private double reply_ ;
      /**
       * <code>double reply = 1;</code>
       * @return The reply.
       */
      @java.lang.Override
      public double getReply() {
        return reply_;
      }
      /**
       * <code>double reply = 1;</code>
       * @param value The reply to set.
       * @return This builder for chaining.
       */
      public Builder setReply(double value) {

        reply_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>double reply = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReply() {
        bitField0_ = (bitField0_ & ~0x00000001);
        reply_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FireflyReply)
    }

    // @@protoc_insertion_point(class_scope:FireflyReply)
    private static final firefly.grpc.FireflyProto.FireflyReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new firefly.grpc.FireflyProto.FireflyReply();
    }

    public static firefly.grpc.FireflyProto.FireflyReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireflyReply>
        PARSER = new com.google.protobuf.AbstractParser<FireflyReply>() {
      @java.lang.Override
      public FireflyReply parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<FireflyReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireflyReply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public firefly.grpc.FireflyProto.FireflyReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireflyRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireflyRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireflyReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireflyReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rfirefly.proto\"\037\n\016FireflyRequest\022\r\n\005fla" +
      "sh\030\001 \001(\001\"\035\n\014FireflyReply\022\r\n\005reply\030\001 \001(\0012" +
      "A\n\016FireflyService\022/\n\rnotifyFirefly\022\017.Fir" +
      "eflyRequest\032\r.FireflyReplyB\034\n\014firefly.gr" +
      "pcB\014FireflyProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FireflyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireflyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireflyRequest_descriptor,
        new java.lang.String[] { "Flash", });
    internal_static_FireflyReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_FireflyReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireflyReply_descriptor,
        new java.lang.String[] { "Reply", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
