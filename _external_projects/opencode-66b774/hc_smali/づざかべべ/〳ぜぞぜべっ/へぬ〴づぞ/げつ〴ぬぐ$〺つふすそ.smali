.class public Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 16

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    iget-boolean v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->ぇぬぎばつ:Z

    if-nez v1, :cond_7

    return-void

    :cond_7
    iget-boolean v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->へぬ〴づぞ:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_27

    iput-boolean v2, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->へぬ〴づぞ:Z

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iput-wide v3, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:J

    const-wide/16 v5, -0x1

    iput-wide v5, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:J

    iput-wide v3, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:J

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->いいにぽつ:F

    iput v2, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    iput v2, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->〳ぜぞぜべっ:I

    .line 2
    :cond_27
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;

    .line 3
    iget-wide v3, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_43

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iget-wide v7, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:J

    iget v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺふねづ〺:I

    int-to-long v9, v1

    add-long/2addr v7, v9

    cmp-long v1, v3, v7

    if-lez v1, :cond_43

    const/4 v1, 0x1

    goto :goto_44

    :cond_43
    const/4 v1, 0x0

    :goto_44
    if-nez v1, :cond_d7

    .line 4
    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->づざかべべ()Z

    move-result v1

    if-nez v1, :cond_50

    goto/16 :goto_d7

    :cond_50
    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    iget-boolean v3, v1, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->おぐぴう〸ず:Z

    if-eqz v3, :cond_70

    iput-boolean v2, v1, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->おぐぴう〸ず:Z

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide v7, v9

    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v3

    iget-object v1, v1, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 6
    :cond_70
    iget-wide v3, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_cf

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(J)F

    move-result v1

    const/high16 v5, -0x3f800000    # -4.0f

    mul-float v5, v5, v1

    mul-float v5, v5, v1

    const/high16 v6, 0x40800000    # 4.0f

    mul-float v1, v1, v6

    add-float/2addr v1, v5

    iget-wide v5, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:J

    sub-long v5, v3, v5

    iput-wide v3, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:J

    long-to-float v3, v5

    mul-float v3, v3, v1

    iget v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:F

    mul-float v1, v1, v3

    float-to-int v1, v1

    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    iget v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:F

    mul-float v3, v3, v1

    float-to-int v1, v3

    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$げつ〴ぬぐ;->〳ぜぞぜべっ:I

    .line 7
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;

    .line 8
    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;->は〲ぱなで:Landroid/widget/ListView;

    .line 9
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v3, v4, :cond_b0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->scrollListBy(I)V

    goto :goto_c7

    :cond_b0
    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_b8

    goto :goto_c7

    :cond_b8
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_bf

    goto :goto_c7

    :cond_bf
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v3, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 10
    :goto_c7
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->びぐびあび:Landroid/view/View;

    invoke-static {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    .line 11
    :cond_cf
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_d7
    :goto_d7
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;

    iput-boolean v2, v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->ぇぬぎばつ:Z

    return-void
.end method
