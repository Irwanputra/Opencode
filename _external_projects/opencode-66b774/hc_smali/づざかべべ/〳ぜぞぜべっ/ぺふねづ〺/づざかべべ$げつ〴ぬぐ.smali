.class public Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# static fields
.field public static final げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$げつ〴ぬぐ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$げつ〴ぬぐ;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/CharSequence;II)I
    .registers 7

    add-int/2addr p3, p2

    const/4 v0, 0x2

    const/4 v1, 0x2

    :goto_3
    if-ge p2, p3, :cond_23

    if-ne v1, v0, :cond_23

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v1

    .line 1
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    const/4 v2, 0x1

    if-eqz v1, :cond_1f

    if-eq v1, v2, :cond_1d

    if-eq v1, v0, :cond_1d

    packed-switch v1, :pswitch_data_24

    const/4 v1, 0x2

    goto :goto_20

    :cond_1d
    :pswitch_1d
    const/4 v1, 0x0

    goto :goto_20

    :cond_1f
    :pswitch_1f
    const/4 v1, 0x1

    :goto_20
    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_23
    return v1

    :pswitch_data_24
    .packed-switch 0xe
        :pswitch_1f
        :pswitch_1f
        :pswitch_1d
        :pswitch_1d
    .end packed-switch
.end method
