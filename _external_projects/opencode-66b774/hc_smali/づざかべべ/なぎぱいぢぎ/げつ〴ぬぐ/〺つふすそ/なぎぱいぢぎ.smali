.class public abstract Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぁごぐすすぃ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$くし〴〺ぅ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$おぐぴう〸ず;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$へぬ〴づぞ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$のぷのちつ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$てぜきぽく;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぺふねづ〺;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$なぎぱいぢぎ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$いいにぽつ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぺぁあねじ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$〳ぜぞぜべっ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$〺つふすそ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$づざかべべ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

.field public くし〴〺ぅ:Ljava/lang/String;

.field public げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;

.field public づざかべべ:I

.field public なぎぱいぢぎ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u306a\u304e\u3071\u3044\u3062\u304e$\u3047\u306c\u304e\u3070\u3064;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->びぐびあび:I

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->づざかべべ:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 6

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/lang/String;

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##.##"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;

    const-string v4, "["

    invoke-static {v0, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v4, v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;->げつ〴ぬぐ:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " , "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;->〺つふすそ:F

    float-to-double v3, v3

    invoke-virtual {v1, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_f

    :cond_3f
    return-object v0
.end method

.method public 〺つふすそ(F)F
    .registers 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;

    .line 1
    iget-object v3, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->なぎぱいぢぎ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    if-eqz v3, :cond_1c

    float-to-double v8, v1

    iget-object v10, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〳ぜぞぜべっ:[D

    invoke-virtual {v3, v8, v9, v10}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ(D[D)V

    iget-object v3, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->なぎぱいぢぎ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    iget-object v10, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->ぁごぐすすぃ:[D

    invoke-virtual {v3, v8, v9, v10}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ(D[D)V

    goto :goto_22

    :cond_1c
    iget-object v3, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〳ぜぞぜべっ:[D

    aput-wide v6, v3, v4

    aput-wide v6, v3, v5

    :goto_22
    iget-object v3, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    float-to-double v8, v1

    invoke-virtual {v3, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび(D)D

    move-result-wide v10

    iget-object v1, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    .line 2
    iget v3, v1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび:I

    const-wide v12, 0x401921fb54442d18L    # 6.283185307179586

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    const-wide/high16 v16, 0x4010000000000000L    # 4.0

    packed-switch v3, :pswitch_data_a8

    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ(D)D

    move-result-wide v6

    mul-double v6, v6, v12

    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ(D)D

    move-result-wide v8

    mul-double v8, v8, v12

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    goto :goto_94

    :pswitch_4a
    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ(D)D

    move-result-wide v6

    mul-double v6, v6, v16

    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ(D)D

    move-result-wide v8

    mul-double v8, v8, v16

    add-double/2addr v8, v14

    rem-double v8, v8, v16

    sub-double/2addr v8, v14

    goto :goto_94

    :pswitch_5b
    const-wide v6, -0x3fe6de04abbbd2e8L    # -6.283185307179586

    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ(D)D

    move-result-wide v14

    mul-double v14, v14, v6

    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ(D)D

    move-result-wide v6

    mul-double v6, v6, v12

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    goto :goto_7b

    :pswitch_71
    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ(D)D

    move-result-wide v6

    neg-double v6, v6

    goto :goto_7b

    :pswitch_77
    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ(D)D

    move-result-wide v6

    :goto_7b
    mul-double v6, v6, v14

    goto :goto_96

    :pswitch_7e
    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ(D)D

    move-result-wide v6

    mul-double v6, v6, v16

    invoke-virtual {v1, v8, v9}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ(D)D

    move-result-wide v8

    mul-double v8, v8, v16

    const-wide/high16 v12, 0x4008000000000000L    # 3.0

    add-double/2addr v8, v12

    rem-double v8, v8, v16

    sub-double/2addr v8, v14

    invoke-static {v8, v9}, Ljava/lang/Math;->signum(D)D

    move-result-wide v8

    :goto_94
    mul-double v6, v6, v8

    .line 3
    :goto_96
    :pswitch_96
    iget-object v1, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〳ぜぞぜべっ:[D

    aget-wide v3, v1, v4

    aget-wide v8, v1, v5

    mul-double v10, v10, v8

    add-double/2addr v10, v3

    iget-object v1, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->ぁごぐすすぃ:[D

    aget-wide v2, v1, v5

    mul-double v6, v6, v2

    add-double/2addr v6, v10

    double-to-float v1, v6

    return v1

    :pswitch_data_a8
    .packed-switch 0x1
        :pswitch_96
        :pswitch_7e
        :pswitch_77
        :pswitch_71
        :pswitch_5b
        :pswitch_4a
    .end packed-switch
.end method

.method public abstract くし〴〺ぅ(Landroid/view/View;F)V
.end method

.method public げつ〴ぬぐ(F)F
    .registers 9

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;

    .line 1
    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->なぎぱいぢぎ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_f

    float-to-double v4, p1

    iget-object v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->ぁごぐすすぃ:[D

    invoke-virtual {v1, v4, v5, v6}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ(D[D)V

    goto :goto_1f

    :cond_f
    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->ぁごぐすすぃ:[D

    iget-object v4, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->づざかべべ:[F

    aget v4, v4, v3

    float-to-double v4, v4

    aput-wide v4, v1, v3

    iget-object v4, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〺つふすそ:[F

    aget v4, v4, v3

    float-to-double v4, v4

    aput-wide v4, v1, v2

    :goto_1f
    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->ぁごぐすすぃ:[D

    aget-wide v3, v1, v3

    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    float-to-double v5, p1

    invoke-virtual {v1, v5, v6}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび(D)D

    move-result-wide v5

    iget-object p1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->ぁごぐすすぃ:[D

    aget-wide v0, p1, v2

    mul-double v5, v5, v0

    add-double/2addr v5, v3

    double-to-float p1, v5

    return p1
.end method

.method public びぐびあび(F)V
    .registers 22
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    move-object/from16 v0, p0

    const-class v1, D

    iget-object v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_d

    return-void

    :cond_d
    iget-object v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    new-instance v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {v4, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$げつ〴ぬぐ;-><init>(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;)V

    invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-array v3, v2, [D

    const/4 v4, 0x2

    new-array v5, v4, [I

    const/4 v6, 0x1

    aput v4, v5, v6

    const/4 v7, 0x0

    aput v2, v5, v7

    invoke-static {v1, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[D

    new-instance v8, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;

    iget v9, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->びぐびあび:I

    iget v10, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->づざかべべ:I

    invoke-direct {v8, v9, v10, v2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;-><init>(III)V

    iput-object v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;

    iget-object v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v8, 0x0

    :goto_3a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_87

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;

    iget v10, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;->びぐびあび:F

    float-to-double v11, v10

    const-wide v13, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v13

    aput-wide v11, v3, v8

    aget-object v11, v5, v8

    iget v12, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;->〺つふすそ:F

    float-to-double v13, v12

    aput-wide v13, v11, v7

    aget-object v11, v5, v8

    iget v13, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;->くし〴〺ぅ:F

    float-to-double v14, v13

    aput-wide v14, v11, v6

    iget-object v11, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;

    iget v9, v9, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$ぇぬぎばつ;->げつ〴ぬぐ:I

    .line 1
    iget-object v14, v11, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->くし〴〺ぅ:[D

    int-to-double v6, v9

    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    div-double v6, v6, v16

    aput-wide v6, v14, v8

    iget-object v6, v11, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->びぐびあび:[F

    aput v10, v6, v8

    iget-object v6, v11, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->づざかべべ:[F

    aput v13, v6, v8

    iget-object v6, v11, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〺つふすそ:[F

    aput v12, v6, v8

    add-int/lit8 v8, v8, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_3a

    .line 2
    :cond_87
    iget-object v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;

    .line 3
    iget-object v6, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->くし〴〺ぅ:[D

    array-length v6, v6

    new-array v7, v4, [I

    const/4 v8, 0x1

    aput v4, v7, v8

    const/4 v4, 0x0

    aput v6, v7, v4

    invoke-static {v1, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[D

    iget-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〺つふすそ:[F

    array-length v6, v4

    add-int/2addr v6, v8

    new-array v6, v6, [D

    iput-object v6, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->ぁごぐすすぃ:[D

    array-length v4, v4

    add-int/2addr v4, v8

    new-array v4, v4, [D

    iput-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〳ぜぞぜべっ:[D

    iget-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->くし〴〺ぅ:[D

    const/4 v6, 0x0

    aget-wide v7, v4, v6

    const-wide/16 v9, 0x0

    cmpl-double v4, v7, v9

    if-lez v4, :cond_bc

    iget-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    iget-object v7, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->びぐびあび:[F

    aget v7, v7, v6

    invoke-virtual {v4, v9, v10, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ(DF)V

    :cond_bc
    iget-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->くし〴〺ぅ:[D

    array-length v6, v4

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    aget-wide v7, v4, v6

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    cmpg-double v4, v7, v11

    if-gez v4, :cond_d2

    iget-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    iget-object v7, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->びぐびあび:[F

    aget v6, v7, v6

    invoke-virtual {v4, v11, v12, v6}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ(DF)V

    :cond_d2
    const/4 v4, 0x0

    :goto_d3
    array-length v6, v1

    if-ge v4, v6, :cond_101

    aget-object v6, v1, v4

    iget-object v7, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->づざかべべ:[F

    aget v7, v7, v4

    float-to-double v7, v7

    const/4 v11, 0x0

    aput-wide v7, v6, v11

    const/4 v6, 0x0

    :goto_e1
    iget-object v7, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->〺つふすそ:[F

    array-length v8, v7

    if-ge v6, v8, :cond_f1

    aget-object v8, v1, v6

    aget v7, v7, v6

    float-to-double v11, v7

    const/4 v7, 0x1

    aput-wide v11, v8, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_e1

    :cond_f1
    iget-object v6, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    iget-object v7, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->くし〴〺ぅ:[D

    aget-wide v11, v7, v4

    iget-object v7, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->びぐびあび:[F

    aget v7, v7, v4

    invoke-virtual {v6, v11, v12, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ(DF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_d3

    :cond_101
    iget-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;

    move-wide v7, v9

    const/4 v6, 0x0

    .line 4
    :goto_105
    iget-object v11, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ:[F

    array-length v12, v11

    if-ge v6, v12, :cond_11a

    aget v11, v11, v6

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v7, v11

    add-int/lit8 v6, v6, 0x1

    goto :goto_105

    :cond_11a
    move-wide v11, v9

    const/4 v6, 0x1

    :goto_11c
    iget-object v13, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ:[F

    array-length v14, v13

    const/high16 v16, 0x40000000    # 2.0f

    if-ge v6, v14, :cond_146

    add-int/lit8 v14, v6, -0x1

    aget v17, v13, v14

    aget v13, v13, v6

    add-float v17, v17, v13

    div-float v13, v17, v16

    iget-object v15, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:[D

    aget-wide v18, v15, v6

    aget-wide v14, v15, v14

    sub-double v18, v18, v14

    float-to-double v13, v13

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v18, v18, v13

    add-double v11, v18, v11

    add-int/lit8 v6, v6, 0x1

    goto :goto_11c

    :cond_146
    const/4 v15, 0x0

    :goto_147
    iget-object v6, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ:[F

    array-length v13, v6

    if-ge v15, v13, :cond_162

    aget v13, v6, v15

    float-to-double v13, v13

    div-double v18, v7, v11

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v13, v13, v18

    double-to-float v13, v13

    aput v13, v6, v15

    add-int/lit8 v15, v15, 0x1

    goto :goto_147

    :cond_162
    iget-object v6, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:[D

    const/4 v7, 0x0

    aput-wide v9, v6, v7

    const/4 v8, 0x1

    :goto_168
    iget-object v6, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ:[F

    array-length v7, v6

    if-ge v8, v7, :cond_193

    add-int/lit8 v7, v8, -0x1

    aget v9, v6, v7

    aget v6, v6, v8

    add-float/2addr v9, v6

    div-float v9, v9, v16

    iget-object v6, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:[D

    aget-wide v10, v6, v8

    aget-wide v12, v6, v7

    sub-double/2addr v10, v12

    iget-object v6, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:[D

    aget-wide v12, v6, v7

    float-to-double v14, v9

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v14

    add-double/2addr v10, v12

    aput-wide v10, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_168

    .line 5
    :cond_193
    iget-object v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->くし〴〺ぅ:[D

    array-length v6, v4

    const/4 v8, 0x1

    if-le v6, v8, :cond_19f

    const/4 v6, 0x0

    invoke-static {v6, v4, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(I[D[[D)Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    move-result-object v1

    goto :goto_1a1

    :cond_19f
    const/4 v6, 0x0

    const/4 v1, 0x0

    :goto_1a1
    iput-object v1, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ$びぐびあび;->なぎぱいぢぎ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    .line 6
    invoke-static {v6, v3, v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(I[D[[D)Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method
