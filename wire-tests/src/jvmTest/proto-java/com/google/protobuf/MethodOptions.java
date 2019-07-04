// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class MethodOptions extends Message<MethodOptions, MethodOptions.Builder> {
  public static final ProtoAdapter<MethodOptions> ADAPTER = new ProtoAdapter_MethodOptions();

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_DEPRECATED = false;

  public static final IdempotencyLevel DEFAULT_IDEMPOTENCY_LEVEL = IdempotencyLevel.IDEMPOTENCY_UNKNOWN;

  /**
   * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
   *   framework.  We apologize for hoarding these numbers to ourselves, but
   *   we were already using them long before we decided to release Protocol
   *   Buffers.
   * Is this method deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the method, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating methods.
   */
  @WireField(
      tag = 33,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean deprecated;

  @WireField(
      tag = 34,
      adapter = "com.google.protobuf.MethodOptions$IdempotencyLevel#ADAPTER"
  )
  public final IdempotencyLevel idempotency_level;

  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @WireField(
      tag = 999,
      adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<UninterpretedOption> uninterpreted_option;

  public MethodOptions(Boolean deprecated, IdempotencyLevel idempotency_level,
      List<UninterpretedOption> uninterpreted_option) {
    this(deprecated, idempotency_level, uninterpreted_option, ByteString.EMPTY);
  }

  public MethodOptions(Boolean deprecated, IdempotencyLevel idempotency_level,
      List<UninterpretedOption> uninterpreted_option, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.deprecated = deprecated;
    this.idempotency_level = idempotency_level;
    this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", uninterpreted_option);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.deprecated = deprecated;
    builder.idempotency_level = idempotency_level;
    builder.uninterpreted_option = Internal.copyOf("uninterpreted_option", uninterpreted_option);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MethodOptions)) return false;
    MethodOptions o = (MethodOptions) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(deprecated, o.deprecated)
        && Internal.equals(idempotency_level, o.idempotency_level)
        && uninterpreted_option.equals(o.uninterpreted_option);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (deprecated != null ? deprecated.hashCode() : 0);
      result = result * 37 + (idempotency_level != null ? idempotency_level.hashCode() : 0);
      result = result * 37 + uninterpreted_option.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (deprecated != null) builder.append(", deprecated=").append(deprecated);
    if (idempotency_level != null) builder.append(", idempotency_level=").append(idempotency_level);
    if (!uninterpreted_option.isEmpty()) builder.append(", uninterpreted_option=").append(uninterpreted_option);
    return builder.replace(0, 2, "MethodOptions{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MethodOptions, Builder> {
    public Boolean deprecated;

    public IdempotencyLevel idempotency_level;

    public List<UninterpretedOption> uninterpreted_option;

    public Builder() {
      uninterpreted_option = Internal.newMutableList();
    }

    /**
     * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
     *   framework.  We apologize for hoarding these numbers to ourselves, but
     *   we were already using them long before we decided to release Protocol
     *   Buffers.
     * Is this method deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the method, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating methods.
     */
    public Builder deprecated(Boolean deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    public Builder idempotency_level(IdempotencyLevel idempotency_level) {
      this.idempotency_level = idempotency_level;
      return this;
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      Internal.checkElementsNotNull(uninterpreted_option);
      this.uninterpreted_option = uninterpreted_option;
      return this;
    }

    @Override
    public MethodOptions build() {
      return new MethodOptions(deprecated, idempotency_level, uninterpreted_option, super.buildUnknownFields());
    }
  }

  /**
   * Is this method side-effect-free (or safe in HTTP parlance), or idempotent,
   * or neither? HTTP based RPC implementation may choose GET verb for safe
   * methods, and PUT verb for idempotent methods instead of the default POST.
   */
  public enum IdempotencyLevel implements WireEnum {
    IDEMPOTENCY_UNKNOWN(0),

    /**
     * implies idempotent
     */
    NO_SIDE_EFFECTS(1),

    /**
     * idempotent, but may have side effects
     */
    IDEMPOTENT(2);

    public static final ProtoAdapter<IdempotencyLevel> ADAPTER = new ProtoAdapter_IdempotencyLevel();

    private final int value;

    IdempotencyLevel(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static IdempotencyLevel fromValue(int value) {
      switch (value) {
        case 0: return IDEMPOTENCY_UNKNOWN;
        case 1: return NO_SIDE_EFFECTS;
        case 2: return IDEMPOTENT;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }

    private static final class ProtoAdapter_IdempotencyLevel extends EnumAdapter<IdempotencyLevel> {
      ProtoAdapter_IdempotencyLevel() {
        super(IdempotencyLevel.class);
      }

      @Override
      protected IdempotencyLevel fromValue(int value) {
        return IdempotencyLevel.fromValue(value);
      }
    }
  }

  private static final class ProtoAdapter_MethodOptions extends ProtoAdapter<MethodOptions> {
    public ProtoAdapter_MethodOptions() {
      super(FieldEncoding.LENGTH_DELIMITED, MethodOptions.class);
    }

    @Override
    public int encodedSize(MethodOptions value) {
      return ProtoAdapter.BOOL.encodedSizeWithTag(33, value.deprecated)
          + IdempotencyLevel.ADAPTER.encodedSizeWithTag(34, value.idempotency_level)
          + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, value.uninterpreted_option)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MethodOptions value) throws IOException {
      ProtoAdapter.BOOL.encodeWithTag(writer, 33, value.deprecated);
      IdempotencyLevel.ADAPTER.encodeWithTag(writer, 34, value.idempotency_level);
      UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999, value.uninterpreted_option);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MethodOptions decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 33: builder.deprecated(ProtoAdapter.BOOL.decode(reader)); break;
          case 34: {
            try {
              builder.idempotency_level(IdempotencyLevel.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 999: builder.uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public MethodOptions redact(MethodOptions value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.uninterpreted_option, UninterpretedOption.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}