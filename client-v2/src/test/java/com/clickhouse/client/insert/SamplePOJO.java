package com.clickhouse.client.insert;

import com.clickhouse.client.api.metadata.TableSchema;
import com.clickhouse.data.ClickHouseEnum;
import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.random.RandomGenerator;

public class SamplePOJO {
    private int int8;
    private int int16;
    private int int32;
    private long int64;
    private BigInteger int128;
    private BigInteger int256;

    private int uint8;
    private int uint16;
    private long uint32;
    private long uint64;
    private BigInteger uint128;
    private BigInteger uint256;

    private float float32;
    private double float64;

    private BigDecimal decimal32;
    private BigDecimal decimal64;
    private BigDecimal decimal128;
    private BigDecimal decimal256;

    private boolean bool;

    private String string;
    private String fixedString;

    private LocalDate date;
    private LocalDate date32;

    private LocalDateTime dateTime;
    private LocalDateTime dateTime64;

    private UUID uuid;

    private byte enum8;
    private int enum16;

    private Inet4Address ipv4;
    private Inet6Address ipv6;

    private List<String> array;
    private List<Integer> tuple;
    private Map<String, Integer> map;
    private SamplePOJOInner inner;

    public SamplePOJO() {
        int8 = RandomGenerator.getDefault().nextInt(-127, 128);
        int16 = RandomGenerator.getDefault().nextInt(-32767,32768);
        int32 = RandomGenerator.getDefault().nextInt();
        int64 = RandomGenerator.getDefault().nextLong(9223372036854775807L);
        int128 = BigInteger.valueOf(RandomGenerator.getDefault().nextLong());
        int256 = BigInteger.valueOf(RandomGenerator.getDefault().nextLong());

        uint8 = RandomGenerator.getDefault().nextInt(0, 256);
        uint16 = RandomGenerator.getDefault().nextInt(0, 65536);
        uint32 = RandomGenerator.getDefault().nextLong(0, 4294967296L);
        uint64 = RandomGenerator.getDefault().nextLong(0, Long.MAX_VALUE);
        uint128 = BigInteger.valueOf(RandomGenerator.getDefault().nextLong(0, Long.MAX_VALUE));
        uint256 = BigInteger.valueOf(RandomGenerator.getDefault().nextLong(0, Long.MAX_VALUE));

        float32 = RandomGenerator.getDefault().nextFloat();
        float64 = RandomGenerator.getDefault().nextDouble();

        decimal32 = BigDecimal.valueOf(RandomGenerator.getDefault().nextDouble());
        decimal64 = BigDecimal.valueOf(RandomGenerator.getDefault().nextDouble());
        decimal128 = BigDecimal.valueOf(RandomGenerator.getDefault().nextDouble());
        decimal256 = BigDecimal.valueOf(RandomGenerator.getDefault().nextDouble());

        bool = RandomGenerator.getDefault().nextBoolean();

        string = RandomStringUtils.randomAlphabetic(1, 512);
        fixedString = RandomStringUtils.randomAlphabetic(3);

        date = LocalDate.now();
        date32 = LocalDate.now();

        dateTime = LocalDateTime.now();
        dateTime64 = LocalDateTime.now();

        uuid = UUID.randomUUID();

        enum8 = (byte) RandomGenerator.getDefault().nextInt(0, 27);
        enum16 = RandomGenerator.getDefault().nextInt(0, 27);

        try {
            Random random = new Random();
            byte[] addr4 = new byte[4];
            random.nextBytes(addr4);
            ipv4 = (Inet4Address) Inet4Address.getByAddress(addr4);

            byte[] addr6 = new byte[16];
            random.nextBytes(addr6);
            ipv6 = (Inet6Address) Inet6Address.getByAddress(addr6);
        } catch (UnknownHostException e) {
            ipv4 = null;
            ipv6 = null;
        }

        array = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        tuple = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        map = Map.of("a", 1, "b", 2, "c", 3, "d", 4, "e", 5, "f", 6, "g", 7, "h", 8, "i", 9, "j", 10);

        inner = new SamplePOJOInner();
    }

    public int getInt8() {
        return int8;
    }

    public void setInt8(int int8) {
        this.int8 = int8;
    }

    public int getInt16() {
        return int16;
    }

    public void setInt16(int int16) {
        this.int16 = int16;
    }

    public int getInt32() {
        return int32;
    }

    public void setInt32(int int32) {
        this.int32 = int32;
    }

    public long getInt64() {
        return int64;
    }

    public void setInt64(long int64) {
        this.int64 = int64;
    }

    public BigInteger getInt128() {
        return int128;
    }

    public void setInt128(BigInteger int128) {
        this.int128 = int128;
    }

    public BigInteger getInt256() {
        return int256;
    }

    public void setInt256(BigInteger int256) {
        this.int256 = int256;
    }

    public int getUint8() {
        return uint8;
    }

    public void setUint8(int uint8) {
        this.uint8 = uint8;
    }

    public int getUint16() {
        return uint16;
    }

    public void setUint16(int uint16) {
        this.uint16 = uint16;
    }

    public long getUint32() {
        return uint32;
    }

    public void setUint32(long uint32) {
        this.uint32 = uint32;
    }

    public long getUint64() {
        return uint64;
    }

    public void setUint64(long uint64) {
        this.uint64 = uint64;
    }

    public BigInteger getUint128() {
        return uint128;
    }

    public void setUint128(BigInteger uint128) {
        this.uint128 = uint128;
    }

    public BigInteger getUint256() {
        return uint256;
    }

    public void setUint256(BigInteger uint256) {
        this.uint256 = uint256;
    }

    public float getFloat32() {
        return float32;
    }

    public void setFloat32(float float32) {
        this.float32 = float32;
    }

    public double getFloat64() {
        return float64;
    }

    public void setFloat64(double float64) {
        this.float64 = float64;
    }

    public BigDecimal getDecimal32() {
        return decimal32;
    }

    public void setDecimal32(BigDecimal decimal32) {
        this.decimal32 = decimal32;
    }

    public BigDecimal getDecimal64() {
        return decimal64;
    }

    public void setDecimal64(BigDecimal decimal64) {
        this.decimal64 = decimal64;
    }

    public BigDecimal getDecimal128() {
        return decimal128;
    }

    public void setDecimal128(BigDecimal decimal128) {
        this.decimal128 = decimal128;
    }

    public BigDecimal getDecimal256() {
        return decimal256;
    }

    public void setDecimal256(BigDecimal decimal256) {
        this.decimal256 = decimal256;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getFixedString() {
        return fixedString;
    }

    public void setFixedString(String fixedString) {
        this.fixedString = fixedString;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate32() {
        return date32;
    }

    public void setDate32(LocalDate date32) {
        this.date32 = date32;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime64() {
        return dateTime64;
    }

    public void setDateTime64(LocalDateTime dateTime64) {
        this.dateTime64 = dateTime64;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public byte getEnum8() {
        return enum8;
    }

    public void setEnum8(byte enum8) {
        this.enum8 = enum8;
    }

    public int getEnum16() {
        return enum16;
    }

    public void setEnum16(int enum16) {
        this.enum16 = enum16;
    }

    public Inet4Address getIpv4() {
        return ipv4;
    }

    public void setIpv4(Inet4Address ipv4) {
        this.ipv4 = ipv4;
    }

    public Inet6Address getIpv6() {
        return ipv6;
    }

    public void setIpv6(Inet6Address ipv6) {
        this.ipv6 = ipv6;
    }

    public List<String> getArray() {
        return array;
    }

    public void setArray(List<String> array) {
        this.array = array;
    }

    public List<Integer> getTuple() {
        return tuple;
    }

    public void setTuple(List<Integer> tuple) {
        this.tuple = tuple;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public SamplePOJOInner getInner() {
        return inner;
    }

    public void setInner(SamplePOJOInner inner) {
        this.inner = inner;
    }

    public static TableSchema generateTableSchema(String tableName) {
        TableSchema schema = new TableSchema();
        schema.setDatabaseName("default");
        schema.setTableName(tableName);
        schema.addColumn("int8", "Int8");
        schema.addColumn("int16", "Int16");
        schema.addColumn("int32", "Int32");
        schema.addColumn("int64", "Int64");
        schema.addColumn("int128", "Int128");
        schema.addColumn("int256", "Int256");

        schema.addColumn("uint8", "UInt8");
        schema.addColumn("uint16", "UInt16");
        schema.addColumn("uint32", "UInt32");
        schema.addColumn("uint64", "UInt64");
        schema.addColumn("uint128", "UInt128");
        schema.addColumn("uint256", "UInt256");

        schema.addColumn("float32", "Float32");
        schema.addColumn("float64", "Float64");

        schema.addColumn("decimal32", "Decimal32(2)");
        schema.addColumn("decimal64", "Decimal64(3)");
        schema.addColumn("decimal128", "Decimal128(4)");
        schema.addColumn("decimal256", "Decimal256(5)");

        schema.addColumn("bool", "UInt8");

        schema.addColumn("string", "String");
        schema.addColumn("fixedString", "FixedString(3)");

        schema.addColumn("date", "Date");
        schema.addColumn("date32", "Date");

        schema.addColumn("dateTime", "DateTime");
        schema.addColumn("dateTime64", "DateTime64(3)");

        schema.addColumn("uuid", "UUID");

        schema.addColumn("enum8", "Enum8('a' = 1, 'b' = 2, 'c' = 3, 'd' = 4, 'e' = 5, 'f' = 6, 'g' = 7, 'h' = 8, 'i' = 9, 'j' = 10, 'k' = 11, 'l' = 12, 'm' = 13, 'n' = 14, 'o' = 15, 'p' = 16, 'q' = 17, 'r' = 18, 's' = 19, 't' = 20, 'u' = 21, 'v' = 22, 'w' = 23, 'x' = 24, 'y' = 25, 'z' = 26)");
        schema.addColumn("enum16", "Enum16('a' = 1, 'b' = 2, 'c' = 3, 'd' = 4, 'e' = 5, 'f' = 6, 'g' = 7, 'h' = 8, 'i' = 9, 'j' = 10, 'k' = 11, 'l' = 12, 'm' = 13, 'n' = 14, 'o' = 15, 'p' = 16, 'q' = 17, 'r' = 18, 's' = 19, 't' = 20, 'u' = 21, 'v' = 22, 'w' = 23, 'x' = 24, 'y' = 25, 'z' = 26)");

        schema.addColumn("ipv4", "IPv4");
        schema.addColumn("ipv6", "IPv6");

        schema.addColumn("array", "Array(String)");
        schema.addColumn("tuple", "Tuple(Int32, Int32, Int32, Int32, Int32, Int32, Int32, Int32, Int32, Int32)");
        schema.addColumn("map", "Map(String, Int32)");

        //schema.addColumn("inner", "Nested (innerInt Int32, innerString String)");

        return schema;
    }

    public static String generateTableCreateSQL(String tableName) {
        TableSchema schema = generateTableSchema(tableName);
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ").append(schema.getTableName()).append(" (");
        for (int i = 0; i < schema.getColumns().size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(schema.getColumns().get(i).getColumnName()).append(" ").append(schema.getColumns().get(i).getOriginalTypeName());
        }
        sb.append(") ENGINE = Memory");
        return sb.toString();
    }

    public static class SamplePOJOInner {
        private int innerInt;
        private String innerString;

        public SamplePOJOInner() {
            innerInt = RandomGenerator.getDefault().nextInt();
            innerString = "inner" + RandomGenerator.getDefault().nextInt();
        }

        public static TableSchema generateTableSchema(String tableName) {
            TableSchema schema = new TableSchema();
            schema.setDatabaseName("default");
            schema.setTableName(tableName);
            schema.addColumn("innerInt", "Int32");
            schema.addColumn("innerString", "String");
            return schema;
        }

        public int getInnerInt() {
            return innerInt;
        }

        public void setInnerInt(int innerInt) {
            this.innerInt = innerInt;
        }

        public String getInnerString() {
            return innerString;
        }

        public void setInnerString(String innerString) {
            this.innerString = innerString;
        }
    }
}
