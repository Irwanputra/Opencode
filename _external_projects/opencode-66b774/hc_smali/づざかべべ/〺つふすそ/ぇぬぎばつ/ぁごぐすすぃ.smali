.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:J

.field public くし〴〺ぅ:Landroid/view/animation/Interpolator;

.field public final げつ〴ぬぐ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u3054\u3065\u3054\u304d\u3048;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:Z

.field public final なぎぱいぢぎ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/でどあくず;

.field public びぐびあび:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->〺つふすそ:J

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/でどあくず;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 8

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->づざかべべ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_52

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iget-wide v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->〺つふすそ:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_22

    invoke-virtual {v1, v2, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->くし〴〺ぅ(J)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    :cond_22
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/view/animation/Interpolator;

    if-eqz v2, :cond_37

    .line 1
    iget-object v3, v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_37

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 2
    :cond_37
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;

    if-eqz v2, :cond_40

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/でどあくず;

    invoke-virtual {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->びぐびあび(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    .line 3
    :cond_40
    iget-object v1, v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_b

    :cond_52
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->づざかべべ:Z

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->づざかべべ:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->〺つふすそ()V

    goto :goto_b

    :cond_1b
    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->づざかべべ:Z

    return-void
.end method
