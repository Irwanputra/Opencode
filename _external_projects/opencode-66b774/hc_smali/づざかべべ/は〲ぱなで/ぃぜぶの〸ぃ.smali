.class public abstract Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;
.super Lづざかべべ/は〲ぱなで/ぶでにく〼〳;
.source ""


# static fields
.field public static final げつ〴ぬぐ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android:visibilityPropagation:visibility"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "android:visibilityPropagation:center"

    aput-object v2, v0, v1

    sput-object v0, Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;->げつ〴ぬぐ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/ぶでにく〼〳;-><init>()V

    return-void
.end method

.method public static 〺つふすそ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;I)I
    .registers 4

    const/4 v0, -0x1

    if-nez p0, :cond_4

    return v0

    :cond_4
    iget-object p0, p0, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v1, "android:visibilityPropagation:center"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    if-nez p0, :cond_11

    return v0

    :cond_11
    aget p0, p0, p1

    return p0
.end method


# virtual methods
.method public くし〴〺ぅ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)I
    .registers 4

    const/16 v0, 0x8

    if-nez p1, :cond_5

    return v0

    :cond_5
    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v1, "android:visibilityPropagation:visibility"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_12

    return v0

    :cond_12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
