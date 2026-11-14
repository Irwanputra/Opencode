package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D16457379462628768197 extends dev.epro.r0.K15572083692188606544 {
    public final java.io.Serializable a;

    public D16457379462628768197(java.lang.Boolean bool) {
        java.util.Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean r(dev.epro.r0.D16457379462628768197 d16457379462628768197) {
        java.io.Serializable serializable = d16457379462628768197.a;
        if (!(serializable instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) serializable;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }

    public final boolean b() {
        java.io.Serializable serializable = this.a;
        return serializable instanceof java.lang.Boolean ? ((java.lang.Boolean) serializable).booleanValue() : java.lang.Boolean.parseBoolean(p());
    }

    public final double c() {
        return this.a instanceof java.lang.Number ? o().doubleValue() : java.lang.Double.parseDouble(p());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dev.epro.r0.D16457379462628768197.class != obj.getClass()) {
            return false;
        }
        dev.epro.r0.D16457379462628768197 d16457379462628768197 = (dev.epro.r0.D16457379462628768197) obj;
        java.io.Serializable serializable = d16457379462628768197.a;
        boolean zR = r(this);
        java.io.Serializable serializable2 = this.a;
        if (zR && r(d16457379462628768197)) {
            return ((serializable2 instanceof java.math.BigInteger) || (serializable instanceof java.math.BigInteger)) ? q().equals(d16457379462628768197.q()) : o().longValue() == d16457379462628768197.o().longValue();
        }
        if (!(serializable2 instanceof java.lang.Number) || !(serializable instanceof java.lang.Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof java.math.BigDecimal) && (serializable instanceof java.math.BigDecimal)) {
            return (serializable2 instanceof java.math.BigDecimal ? (java.math.BigDecimal) serializable2 : dev.epro.r0.B5998207562248239613.G(p())).compareTo(serializable instanceof java.math.BigDecimal ? (java.math.BigDecimal) serializable : dev.epro.r0.B5998207562248239613.G(d16457379462628768197.p())) == 0;
        }
        double dC = c();
        double dC2 = d16457379462628768197.c();
        if (dC != dC2) {
            return java.lang.Double.isNaN(dC) && java.lang.Double.isNaN(dC2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (r(this)) {
            jDoubleToLongBits = o().longValue();
        } else {
            java.io.Serializable serializable = this.a;
            if (!(serializable instanceof java.lang.Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = java.lang.Double.doubleToLongBits(o().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final float i() {
        return this.a instanceof java.lang.Number ? o().floatValue() : java.lang.Float.parseFloat(p());
    }

    public final int j() {
        return this.a instanceof java.lang.Number ? o().intValue() : java.lang.Integer.parseInt(p());
    }

    public final long n() {
        return this.a instanceof java.lang.Number ? o().longValue() : java.lang.Long.parseLong(p());
    }

    public final java.lang.Number o() {
        java.io.Serializable serializable = this.a;
        if (serializable instanceof java.lang.Number) {
            return (java.lang.Number) serializable;
        }
        if (serializable instanceof java.lang.String) {
            return new dev.epro.r0.H1162839155067368006((java.lang.String) serializable);
        }
        dev.epro.r0.D11988991656201568495.j("Primitive is neither a number nor a string");
        return null;
    }

    public final java.lang.String p() {
        java.io.Serializable serializable = this.a;
        if (serializable instanceof java.lang.String) {
            return (java.lang.String) serializable;
        }
        if (serializable instanceof java.lang.Number) {
            return o().toString();
        }
        if (serializable instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) serializable).toString();
        }
        throw new java.lang.AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final java.math.BigInteger q() {
        java.io.Serializable serializable = this.a;
        if (serializable instanceof java.math.BigInteger) {
            return (java.math.BigInteger) serializable;
        }
        if (r(this)) {
            return java.math.BigInteger.valueOf(o().longValue());
        }
        java.lang.String strP = p();
        dev.epro.r0.B5998207562248239613.k(strP);
        return new java.math.BigInteger(strP);
    }

    public D16457379462628768197(java.lang.Number number) {
        java.util.Objects.requireNonNull(number);
        this.a = number;
    }

    public D16457379462628768197(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.a = str;
    }

    public final dev.epro.r0.K15572083692188606544 a() {
        return this;
    }
}
