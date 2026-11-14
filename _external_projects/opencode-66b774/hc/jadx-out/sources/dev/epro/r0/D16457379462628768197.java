package dev.epro.r0;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D16457379462628768197 extends K15572083692188606544 {
    public final Serializable a;

    public D16457379462628768197(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean r(D16457379462628768197 d16457379462628768197) {
        Serializable serializable = d16457379462628768197.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final boolean b() {
        Serializable serializable = this.a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(p());
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final double c() {
        return this.a instanceof Number ? o().doubleValue() : Double.parseDouble(p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D16457379462628768197.class != obj.getClass()) {
            return false;
        }
        D16457379462628768197 d16457379462628768197 = (D16457379462628768197) obj;
        Serializable serializable = d16457379462628768197.a;
        boolean zR = r(this);
        Serializable serializable2 = this.a;
        if (zR && r(d16457379462628768197)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? q().equals(d16457379462628768197.q()) : o().longValue() == d16457379462628768197.o().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : B5998207562248239613.G(p())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : B5998207562248239613.G(d16457379462628768197.p())) == 0;
        }
        double dC = c();
        double dC2 = d16457379462628768197.c();
        if (dC != dC2) {
            return Double.isNaN(dC) && Double.isNaN(dC2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (r(this)) {
            jDoubleToLongBits = o().longValue();
        } else {
            Serializable serializable = this.a;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(o().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final float i() {
        return this.a instanceof Number ? o().floatValue() : Float.parseFloat(p());
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final int j() {
        return this.a instanceof Number ? o().intValue() : Integer.parseInt(p());
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final long n() {
        return this.a instanceof Number ? o().longValue() : Long.parseLong(p());
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final Number o() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new H1162839155067368006((String) serializable);
        }
        D11988991656201568495.j("Primitive is neither a number nor a string");
        return null;
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final String p() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return o().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger q() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (r(this)) {
            return BigInteger.valueOf(o().longValue());
        }
        String strP = p();
        B5998207562248239613.k(strP);
        return new BigInteger(strP);
    }

    public D16457379462628768197(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public D16457379462628768197(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    @Override // dev.epro.r0.K15572083692188606544
    public final K15572083692188606544 a() {
        return this;
    }
}
