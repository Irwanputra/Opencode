.class public abstract Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:Lづざかべべ/づざかべべ/くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045<",
            "Ljava/lang/ref/WeakReference<",
            "L\u3065\u3056\u304b\u3079\u3079/\u303a\u3064\u3075\u3059\u305d/\u307a\u3075\u306d\u3065\u303a/\u307a\u3075\u306d\u3065\u303a;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final くし〴〺ぅ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lづざかべべ/づざかべべ/くし〴〺ぅ;

    const/4 v1, 0x0

    .line 1
    invoke-direct {v0, v1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;-><init>(I)V

    .line 2
    sput-object v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〺つふすそ:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->くし〴〺ぅ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ごづごきえ(Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;)V
    .registers 4

    sget-object v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->くし〴〺ぅ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〺つふすそ:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    if-eq v2, p0, :cond_1f

    if-nez v2, :cond_9

    :cond_1f
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_9

    :cond_23
    monitor-exit v0

    return-void

    :catchall_25
    move-exception p0

    monitor-exit v0
    :try_end_27
    .catchall {:try_start_3 .. :try_end_27} :catchall_25

    goto :goto_29

    :goto_28
    throw p0

    :goto_29
    goto :goto_28
.end method


# virtual methods
.method public abstract 〳ぜぞぜべっ()Landroid/view/MenuInflater;
.end method

.method public abstract 〻ぞまぎな〻(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public ぁごぐすすぃ()I
    .registers 2

    const/16 v0, -0x64

    return v0
.end method

.method public abstract いいにぽつ()V
.end method

.method public ぇ〳〲〺すっ(I)V
    .registers 2

    return-void
.end method

.method public abstract ぇぬぎばつ()V
.end method

.method public abstract ぉ〲なぱぽた(Landroidx/appcompat/widget/Toolbar;)V
.end method

.method public abstract ぉざぅち〻(Landroid/os/Bundle;)V
.end method

.method public abstract おぐぴう〸ず(Landroid/os/Bundle;)V
.end method

.method public abstract くし〴〺ぅ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract ざっざへづ(I)Z
.end method

.method public abstract ざとぅぼこ〺()V
.end method

.method public abstract づざかべべ(I)Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation
.end method

.method public abstract てぜきぽく(Landroid/content/res/Configuration;)V
.end method

.method public abstract でどあくず(I)V
.end method

.method public abstract なぎぱいぢぎ()Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;
.end method

.method public abstract のぷのちつ(Landroid/os/Bundle;)V
.end method

.method public abstract は〲ぱなで()V
.end method

.method public abstract びえぁぜい(Ljava/lang/CharSequence;)V
.end method

.method public びぐびあび(Landroid/content/Context;)Landroid/content/Context;
    .registers 2

    return-object p1
.end method

.method public abstract ぶでにく〼〳(Landroid/view/View;)V
.end method

.method public abstract へぬ〴づぞ()V
.end method

.method public abstract ぺぁあねじ()Landroidx/appcompat/app/ActionBar;
.end method

.method public abstract ぺふねづ〺()V
.end method
