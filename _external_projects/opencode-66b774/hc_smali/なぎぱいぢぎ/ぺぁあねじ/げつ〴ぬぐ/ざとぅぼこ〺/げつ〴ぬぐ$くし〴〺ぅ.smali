.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〺つふすそ:J

.field public くし〴〺ぅ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(JLjava/lang/Runnable;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ$げつ〴ぬぐ;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:J

    iput-object p3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .registers 6

    check-cast p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ$くし〴〺ぅ;

    iget-wide v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:J

    iget-wide v2, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ざとぅぼこ〺/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_c

    const/4 p1, 0x1

    return p1

    :cond_c
    cmp-long p1, v0, v2

    if-nez p1, :cond_12

    const/4 p1, 0x0

    return p1

    :cond_12
    const/4 p1, -0x1

    return p1
.end method
