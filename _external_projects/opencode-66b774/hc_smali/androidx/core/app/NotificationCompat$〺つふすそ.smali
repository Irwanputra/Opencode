.class public Landroidx/core/app/NotificationCompat$〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:Z

.field public 〺つふすそ:Landroidx/core/graphics/drawable/IconCompat;

.field public final ぁごぐすすぃ:I

.field public いいにぽつ:Ljava/lang/CharSequence;

.field public final くし〴〺ぅ:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

.field public final げつ〴ぬぐ:Landroid/os/Bundle;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public final びぐびあび:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

.field public ぺぁあねじ:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public ぺふねづ〺:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .registers 16

    const/4 v0, 0x0

    if-nez p1, :cond_4

    goto :goto_a

    :cond_4
    const-string v1, ""

    invoke-static {v0, v1, p1}, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    :goto_a
    move-object v2, v0

    .line 1
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v11}, Landroidx/core/app/NotificationCompat$〺つふすそ;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;ZIZZ)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;ZIZZ)V
    .registers 24

    move v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_5

    goto :goto_b

    :cond_5
    const-string v2, ""

    invoke-static {v1, v2, p1}, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    :goto_b
    move-object v3, v1

    move-object v2, p0

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move/from16 v12, p10

    invoke-direct/range {v2 .. v12}, Landroidx/core/app/NotificationCompat$〺つふすそ;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;ZIZZ)V

    return-void
.end method

.method public constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;ZIZZ)V
    .registers 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->なぎぱいぢぎ:Z

    iput-object p1, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->〺つふすそ:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz p1, :cond_17

    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->〳ぜぞぜべっ()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_17

    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび()I

    move-result p1

    iput p1, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぺぁあねじ:I

    :cond_17
    invoke-static {p2}, Landroidx/core/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->いいにぽつ:Ljava/lang/CharSequence;

    iput-object p3, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぺふねづ〺:Landroid/app/PendingIntent;

    if-eqz p4, :cond_22

    goto :goto_27

    :cond_22
    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    :goto_27
    iput-object p4, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->げつ〴ぬぐ:Landroid/os/Bundle;

    iput-object p5, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->くし〴〺ぅ:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    iput-object p6, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->びぐびあび:[Lづざかべべ/〳ぜぞぜべっ/づざかべべ/ぺぁあねじ;

    iput-boolean p7, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->づざかべべ:Z

    iput p8, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぁごぐすすぃ:I

    iput-boolean p9, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->なぎぱいぢぎ:Z

    iput-boolean p10, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->〳ぜぞぜべっ:Z

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()Landroidx/core/graphics/drawable/IconCompat;
    .registers 4

    iget-object v0, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->〺つふすそ:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v0, :cond_11

    iget v0, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->ぺぁあねじ:I

    if-eqz v0, :cond_11

    const/4 v1, 0x0

    const-string v2, ""

    invoke-static {v1, v2, v0}, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->〺つふすそ:Landroidx/core/graphics/drawable/IconCompat;

    :cond_11
    iget-object v0, p0, Landroidx/core/app/NotificationCompat$〺つふすそ;->〺つふすそ:Landroidx/core/graphics/drawable/IconCompat;

    return-object v0
.end method
