.class public Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public いいにぽつ:F

.field public くし〴〺ぅ:F

.field public げつ〴ぬぐ:I

.field public づざかべべ:J

.field public なぎぱいぢぎ:J

.field public びぐびあび:F

.field public ぺぁあねじ:J

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:J

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    iput v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->〳ぜぞぜべっ:I

    return-void
.end method


# virtual methods
.method public final げつ〴ぬぐ(J)F
    .registers 12

    iget-wide v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:J

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-gez v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:J

    const-wide/16 v5, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    cmp-long v8, v3, v5

    if-ltz v8, :cond_29

    cmp-long v5, p1, v3

    if-gez v5, :cond_17

    goto :goto_29

    :cond_17
    sub-long/2addr p1, v3

    iget v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->いいにぽつ:F

    sub-float v1, v7, v0

    long-to-float p1, p1

    iget p2, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺふねづ〺:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {p1, v2, v7}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ(FFF)F

    move-result p1

    mul-float p1, p1, v0

    add-float/2addr p1, v1

    return p1

    :cond_29
    :goto_29
    sub-long/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    long-to-float p1, p1

    iget p2, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {p1, v2, v7}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ(FFF)F

    move-result p1

    mul-float p1, p1, v0

    return p1
.end method
