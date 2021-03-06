/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.serde.test;

import org.apache.commons.lang.builder.HashCodeBuilder;
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

public class ThriftTestObj implements org.apache.thrift.TBase<ThriftTestObj, ThriftTestObj._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftTestObj");

  private static final org.apache.thrift.protocol.TField FIELD1_FIELD_DESC = new org.apache.thrift.protocol.TField("field1", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FIELD2_FIELD_DESC = new org.apache.thrift.protocol.TField("field2", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FIELD3_FIELD_DESC = new org.apache.thrift.protocol.TField("field3", org.apache.thrift.protocol.TType.LIST, (short)3);

  private int field1; // required
  private String field2; // required
  private List<InnerStruct> field3; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD1((short)1, "field1"),
    FIELD2((short)2, "field2"),
    FIELD3((short)3, "field3");

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
        case 1: // FIELD1
          return FIELD1;
        case 2: // FIELD2
          return FIELD2;
        case 3: // FIELD3
          return FIELD3;
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
  private static final int __FIELD1_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD1, new org.apache.thrift.meta_data.FieldMetaData("field1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FIELD2, new org.apache.thrift.meta_data.FieldMetaData("field2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FIELD3, new org.apache.thrift.meta_data.FieldMetaData("field3", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InnerStruct.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftTestObj.class, metaDataMap);
  }

  public ThriftTestObj() {
  }

  public ThriftTestObj(
    int field1,
    String field2,
    List<InnerStruct> field3)
  {
    this();
    this.field1 = field1;
    setField1IsSet(true);
    this.field2 = field2;
    this.field3 = field3;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftTestObj(ThriftTestObj other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.field1 = other.field1;
    if (other.isSetField2()) {
      this.field2 = other.field2;
    }
    if (other.isSetField3()) {
      List<InnerStruct> __this__field3 = new ArrayList<InnerStruct>();
      for (InnerStruct other_element : other.field3) {
        __this__field3.add(new InnerStruct(other_element));
      }
      this.field3 = __this__field3;
    }
  }

  public ThriftTestObj deepCopy() {
    return new ThriftTestObj(this);
  }

  @Override
  public void clear() {
    setField1IsSet(false);
    this.field1 = 0;
    this.field2 = null;
    this.field3 = null;
  }

  public int getField1() {
    return this.field1;
  }

  public void setField1(int field1) {
    this.field1 = field1;
    setField1IsSet(true);
  }

  public void unsetField1() {
    __isset_bit_vector.clear(__FIELD1_ISSET_ID);
  }

  /** Returns true if field field1 is set (has been assigned a value) and false otherwise */
  public boolean isSetField1() {
    return __isset_bit_vector.get(__FIELD1_ISSET_ID);
  }

  public void setField1IsSet(boolean value) {
    __isset_bit_vector.set(__FIELD1_ISSET_ID, value);
  }

  public String getField2() {
    return this.field2;
  }

  public void setField2(String field2) {
    this.field2 = field2;
  }

  public void unsetField2() {
    this.field2 = null;
  }

  /** Returns true if field field2 is set (has been assigned a value) and false otherwise */
  public boolean isSetField2() {
    return this.field2 != null;
  }

  public void setField2IsSet(boolean value) {
    if (!value) {
      this.field2 = null;
    }
  }

  public int getField3Size() {
    return (this.field3 == null) ? 0 : this.field3.size();
  }

  public java.util.Iterator<InnerStruct> getField3Iterator() {
    return (this.field3 == null) ? null : this.field3.iterator();
  }

  public void addToField3(InnerStruct elem) {
    if (this.field3 == null) {
      this.field3 = new ArrayList<InnerStruct>();
    }
    this.field3.add(elem);
  }

  public List<InnerStruct> getField3() {
    return this.field3;
  }

  public void setField3(List<InnerStruct> field3) {
    this.field3 = field3;
  }

  public void unsetField3() {
    this.field3 = null;
  }

  /** Returns true if field field3 is set (has been assigned a value) and false otherwise */
  public boolean isSetField3() {
    return this.field3 != null;
  }

  public void setField3IsSet(boolean value) {
    if (!value) {
      this.field3 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD1:
      if (value == null) {
        unsetField1();
      } else {
        setField1((Integer)value);
      }
      break;

    case FIELD2:
      if (value == null) {
        unsetField2();
      } else {
        setField2((String)value);
      }
      break;

    case FIELD3:
      if (value == null) {
        unsetField3();
      } else {
        setField3((List<InnerStruct>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD1:
      return Integer.valueOf(getField1());

    case FIELD2:
      return getField2();

    case FIELD3:
      return getField3();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD1:
      return isSetField1();
    case FIELD2:
      return isSetField2();
    case FIELD3:
      return isSetField3();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftTestObj)
      return this.equals((ThriftTestObj)that);
    return false;
  }

  public boolean equals(ThriftTestObj that) {
    if (that == null)
      return false;

    boolean this_present_field1 = true;
    boolean that_present_field1 = true;
    if (this_present_field1 || that_present_field1) {
      if (!(this_present_field1 && that_present_field1))
        return false;
      if (this.field1 != that.field1)
        return false;
    }

    boolean this_present_field2 = true && this.isSetField2();
    boolean that_present_field2 = true && that.isSetField2();
    if (this_present_field2 || that_present_field2) {
      if (!(this_present_field2 && that_present_field2))
        return false;
      if (!this.field2.equals(that.field2))
        return false;
    }

    boolean this_present_field3 = true && this.isSetField3();
    boolean that_present_field3 = true && that.isSetField3();
    if (this_present_field3 || that_present_field3) {
      if (!(this_present_field3 && that_present_field3))
        return false;
      if (!this.field3.equals(that.field3))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_field1 = true;
    builder.append(present_field1);
    if (present_field1)
      builder.append(field1);

    boolean present_field2 = true && (isSetField2());
    builder.append(present_field2);
    if (present_field2)
      builder.append(field2);

    boolean present_field3 = true && (isSetField3());
    builder.append(present_field3);
    if (present_field3)
      builder.append(field3);

    return builder.toHashCode();
  }

  public int compareTo(ThriftTestObj other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftTestObj typedOther = (ThriftTestObj)other;

    lastComparison = Boolean.valueOf(isSetField1()).compareTo(typedOther.isSetField1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field1, typedOther.field1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetField2()).compareTo(typedOther.isSetField2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field2, typedOther.field2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetField3()).compareTo(typedOther.isSetField3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field3, typedOther.field3);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FIELD1
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.field1 = iprot.readI32();
            setField1IsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FIELD2
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.field2 = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // FIELD3
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              this.field3 = new ArrayList<InnerStruct>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                InnerStruct _elem2; // required
                _elem2 = new InnerStruct();
                _elem2.read(iprot);
                this.field3.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(FIELD1_FIELD_DESC);
    oprot.writeI32(this.field1);
    oprot.writeFieldEnd();
    if (this.field2 != null) {
      oprot.writeFieldBegin(FIELD2_FIELD_DESC);
      oprot.writeString(this.field2);
      oprot.writeFieldEnd();
    }
    if (this.field3 != null) {
      oprot.writeFieldBegin(FIELD3_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.field3.size()));
        for (InnerStruct _iter3 : this.field3)
        {
          _iter3.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftTestObj(");
    boolean first = true;

    sb.append("field1:");
    sb.append(this.field1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("field2:");
    if (this.field2 == null) {
      sb.append("null");
    } else {
      sb.append(this.field2);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("field3:");
    if (this.field3 == null) {
      sb.append("null");
    } else {
      sb.append(this.field3);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

