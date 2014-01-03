/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TOpenSessionResp implements org.apache.thrift.TBase<TOpenSessionResp, TOpenSessionResp._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TOpenSessionResp");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SERVER_PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("serverProtocolVersion", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SESSION_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionHandle", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField CONFIGURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("configuration", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TOpenSessionRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TOpenSessionRespTupleSchemeFactory());
  }

  private TStatus status; // required
  private TProtocolVersion serverProtocolVersion; // required
  private TSessionHandle sessionHandle; // optional
  private Map<String,String> configuration; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    /**
     * 
     * @see TProtocolVersion
     */
    SERVER_PROTOCOL_VERSION((short)2, "serverProtocolVersion"),
    SESSION_HANDLE((short)3, "sessionHandle"),
    CONFIGURATION((short)4, "configuration");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // SERVER_PROTOCOL_VERSION
          return SERVER_PROTOCOL_VERSION;
        case 3: // SESSION_HANDLE
          return SESSION_HANDLE;
        case 4: // CONFIGURATION
          return CONFIGURATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.SESSION_HANDLE,_Fields.CONFIGURATION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStatus.class)));
    tmpMap.put(_Fields.SERVER_PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("serverProtocolVersion", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TProtocolVersion.class)));
    tmpMap.put(_Fields.SESSION_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("sessionHandle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSessionHandle.class)));
    tmpMap.put(_Fields.CONFIGURATION, new org.apache.thrift.meta_data.FieldMetaData("configuration", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TOpenSessionResp.class, metaDataMap);
  }

  public TOpenSessionResp() {
    this.serverProtocolVersion = org.apache.hive.service.cli.thrift.TProtocolVersion.HIVE_CLI_SERVICE_PROTOCOL_V4;

  }

  public TOpenSessionResp(
    TStatus status,
    TProtocolVersion serverProtocolVersion)
  {
    this();
    this.status = status;
    this.serverProtocolVersion = serverProtocolVersion;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TOpenSessionResp(TOpenSessionResp other) {
    if (other.isSetStatus()) {
      this.status = new TStatus(other.status);
    }
    if (other.isSetServerProtocolVersion()) {
      this.serverProtocolVersion = other.serverProtocolVersion;
    }
    if (other.isSetSessionHandle()) {
      this.sessionHandle = new TSessionHandle(other.sessionHandle);
    }
    if (other.isSetConfiguration()) {
      Map<String,String> __this__configuration = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.configuration.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__configuration_copy_key = other_element_key;

        String __this__configuration_copy_value = other_element_value;

        __this__configuration.put(__this__configuration_copy_key, __this__configuration_copy_value);
      }
      this.configuration = __this__configuration;
    }
  }

  public TOpenSessionResp deepCopy() {
    return new TOpenSessionResp(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.serverProtocolVersion = org.apache.hive.service.cli.thrift.TProtocolVersion.HIVE_CLI_SERVICE_PROTOCOL_V4;

    this.sessionHandle = null;
    this.configuration = null;
  }

  public TStatus getStatus() {
    return this.status;
  }

  public void setStatus(TStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  /**
   * 
   * @see TProtocolVersion
   */
  public TProtocolVersion getServerProtocolVersion() {
    return this.serverProtocolVersion;
  }

  /**
   * 
   * @see TProtocolVersion
   */
  public void setServerProtocolVersion(TProtocolVersion serverProtocolVersion) {
    this.serverProtocolVersion = serverProtocolVersion;
  }

  public void unsetServerProtocolVersion() {
    this.serverProtocolVersion = null;
  }

  /** Returns true if field serverProtocolVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetServerProtocolVersion() {
    return this.serverProtocolVersion != null;
  }

  public void setServerProtocolVersionIsSet(boolean value) {
    if (!value) {
      this.serverProtocolVersion = null;
    }
  }

  public TSessionHandle getSessionHandle() {
    return this.sessionHandle;
  }

  public void setSessionHandle(TSessionHandle sessionHandle) {
    this.sessionHandle = sessionHandle;
  }

  public void unsetSessionHandle() {
    this.sessionHandle = null;
  }

  /** Returns true if field sessionHandle is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionHandle() {
    return this.sessionHandle != null;
  }

  public void setSessionHandleIsSet(boolean value) {
    if (!value) {
      this.sessionHandle = null;
    }
  }

  public int getConfigurationSize() {
    return (this.configuration == null) ? 0 : this.configuration.size();
  }

  public void putToConfiguration(String key, String val) {
    if (this.configuration == null) {
      this.configuration = new HashMap<String,String>();
    }
    this.configuration.put(key, val);
  }

  public Map<String,String> getConfiguration() {
    return this.configuration;
  }

  public void setConfiguration(Map<String,String> configuration) {
    this.configuration = configuration;
  }

  public void unsetConfiguration() {
    this.configuration = null;
  }

  /** Returns true if field configuration is set (has been assigned a value) and false otherwise */
  public boolean isSetConfiguration() {
    return this.configuration != null;
  }

  public void setConfigurationIsSet(boolean value) {
    if (!value) {
      this.configuration = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TStatus)value);
      }
      break;

    case SERVER_PROTOCOL_VERSION:
      if (value == null) {
        unsetServerProtocolVersion();
      } else {
        setServerProtocolVersion((TProtocolVersion)value);
      }
      break;

    case SESSION_HANDLE:
      if (value == null) {
        unsetSessionHandle();
      } else {
        setSessionHandle((TSessionHandle)value);
      }
      break;

    case CONFIGURATION:
      if (value == null) {
        unsetConfiguration();
      } else {
        setConfiguration((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case SERVER_PROTOCOL_VERSION:
      return getServerProtocolVersion();

    case SESSION_HANDLE:
      return getSessionHandle();

    case CONFIGURATION:
      return getConfiguration();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case SERVER_PROTOCOL_VERSION:
      return isSetServerProtocolVersion();
    case SESSION_HANDLE:
      return isSetSessionHandle();
    case CONFIGURATION:
      return isSetConfiguration();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TOpenSessionResp)
      return this.equals((TOpenSessionResp)that);
    return false;
  }

  public boolean equals(TOpenSessionResp that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_serverProtocolVersion = true && this.isSetServerProtocolVersion();
    boolean that_present_serverProtocolVersion = true && that.isSetServerProtocolVersion();
    if (this_present_serverProtocolVersion || that_present_serverProtocolVersion) {
      if (!(this_present_serverProtocolVersion && that_present_serverProtocolVersion))
        return false;
      if (!this.serverProtocolVersion.equals(that.serverProtocolVersion))
        return false;
    }

    boolean this_present_sessionHandle = true && this.isSetSessionHandle();
    boolean that_present_sessionHandle = true && that.isSetSessionHandle();
    if (this_present_sessionHandle || that_present_sessionHandle) {
      if (!(this_present_sessionHandle && that_present_sessionHandle))
        return false;
      if (!this.sessionHandle.equals(that.sessionHandle))
        return false;
    }

    boolean this_present_configuration = true && this.isSetConfiguration();
    boolean that_present_configuration = true && that.isSetConfiguration();
    if (this_present_configuration || that_present_configuration) {
      if (!(this_present_configuration && that_present_configuration))
        return false;
      if (!this.configuration.equals(that.configuration))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_status = true && (isSetStatus());
    builder.append(present_status);
    if (present_status)
      builder.append(status);

    boolean present_serverProtocolVersion = true && (isSetServerProtocolVersion());
    builder.append(present_serverProtocolVersion);
    if (present_serverProtocolVersion)
      builder.append(serverProtocolVersion.getValue());

    boolean present_sessionHandle = true && (isSetSessionHandle());
    builder.append(present_sessionHandle);
    if (present_sessionHandle)
      builder.append(sessionHandle);

    boolean present_configuration = true && (isSetConfiguration());
    builder.append(present_configuration);
    if (present_configuration)
      builder.append(configuration);

    return builder.toHashCode();
  }

  public int compareTo(TOpenSessionResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TOpenSessionResp typedOther = (TOpenSessionResp)other;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServerProtocolVersion()).compareTo(typedOther.isSetServerProtocolVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerProtocolVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverProtocolVersion, typedOther.serverProtocolVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSessionHandle()).compareTo(typedOther.isSetSessionHandle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionHandle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionHandle, typedOther.sessionHandle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfiguration()).compareTo(typedOther.isSetConfiguration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfiguration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.configuration, typedOther.configuration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TOpenSessionResp(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serverProtocolVersion:");
    if (this.serverProtocolVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.serverProtocolVersion);
    }
    first = false;
    if (isSetSessionHandle()) {
      if (!first) sb.append(", ");
      sb.append("sessionHandle:");
      if (this.sessionHandle == null) {
        sb.append("null");
      } else {
        sb.append(this.sessionHandle);
      }
      first = false;
    }
    if (isSetConfiguration()) {
      if (!first) sb.append(", ");
      sb.append("configuration:");
      if (this.configuration == null) {
        sb.append("null");
      } else {
        sb.append(this.configuration);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    if (!isSetServerProtocolVersion()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'serverProtocolVersion' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (sessionHandle != null) {
      sessionHandle.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TOpenSessionRespStandardSchemeFactory implements SchemeFactory {
    public TOpenSessionRespStandardScheme getScheme() {
      return new TOpenSessionRespStandardScheme();
    }
  }

  private static class TOpenSessionRespStandardScheme extends StandardScheme<TOpenSessionResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TOpenSessionResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVER_PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.serverProtocolVersion = TProtocolVersion.findByValue(iprot.readI32());
              struct.setServerProtocolVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SESSION_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sessionHandle = new TSessionHandle();
              struct.sessionHandle.read(iprot);
              struct.setSessionHandleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONFIGURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map208 = iprot.readMapBegin();
                struct.configuration = new HashMap<String,String>(2*_map208.size);
                for (int _i209 = 0; _i209 < _map208.size; ++_i209)
                {
                  String _key210; // required
                  String _val211; // required
                  _key210 = iprot.readString();
                  _val211 = iprot.readString();
                  struct.configuration.put(_key210, _val211);
                }
                iprot.readMapEnd();
              }
              struct.setConfigurationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TOpenSessionResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.serverProtocolVersion != null) {
        oprot.writeFieldBegin(SERVER_PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.serverProtocolVersion.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.sessionHandle != null) {
        if (struct.isSetSessionHandle()) {
          oprot.writeFieldBegin(SESSION_HANDLE_FIELD_DESC);
          struct.sessionHandle.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.configuration != null) {
        if (struct.isSetConfiguration()) {
          oprot.writeFieldBegin(CONFIGURATION_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.configuration.size()));
            for (Map.Entry<String, String> _iter212 : struct.configuration.entrySet())
            {
              oprot.writeString(_iter212.getKey());
              oprot.writeString(_iter212.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TOpenSessionRespTupleSchemeFactory implements SchemeFactory {
    public TOpenSessionRespTupleScheme getScheme() {
      return new TOpenSessionRespTupleScheme();
    }
  }

  private static class TOpenSessionRespTupleScheme extends TupleScheme<TOpenSessionResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TOpenSessionResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.status.write(oprot);
      oprot.writeI32(struct.serverProtocolVersion.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetSessionHandle()) {
        optionals.set(0);
      }
      if (struct.isSetConfiguration()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSessionHandle()) {
        struct.sessionHandle.write(oprot);
      }
      if (struct.isSetConfiguration()) {
        {
          oprot.writeI32(struct.configuration.size());
          for (Map.Entry<String, String> _iter213 : struct.configuration.entrySet())
          {
            oprot.writeString(_iter213.getKey());
            oprot.writeString(_iter213.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TOpenSessionResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = new TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      struct.serverProtocolVersion = TProtocolVersion.findByValue(iprot.readI32());
      struct.setServerProtocolVersionIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sessionHandle = new TSessionHandle();
        struct.sessionHandle.read(iprot);
        struct.setSessionHandleIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map214 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.configuration = new HashMap<String,String>(2*_map214.size);
          for (int _i215 = 0; _i215 < _map214.size; ++_i215)
          {
            String _key216; // required
            String _val217; // required
            _key216 = iprot.readString();
            _val217 = iprot.readString();
            struct.configuration.put(_key216, _val217);
          }
        }
        struct.setConfigurationIsSet(true);
      }
    }
  }

}

