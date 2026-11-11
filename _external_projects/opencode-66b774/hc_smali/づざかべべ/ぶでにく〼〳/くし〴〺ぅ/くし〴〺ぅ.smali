.class public final Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;
.super Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;
.source ""


# instance fields
.field public final げつ〴ぬぐ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/viewpager2/widget/ViewPager2$\u3041\u3054\u3050\u3059\u3059\u3043;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .registers 3

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(IFI)V
    .registers 6

    :try_start_0
    iget-object v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    invoke-virtual {v1, p1, p2, p3}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->〺つふすそ(IFI)V
    :try_end_15
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_15} :catch_17

    goto :goto_6

    :cond_16
    return-void

    :catch_17
    move-exception p1

    invoke-virtual {p0, p1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->びぐびあび(Ljava/util/ConcurrentModificationException;)V

    const/4 p1, 0x0

    goto :goto_1e

    :goto_1d
    throw p1

    :goto_1e
    goto :goto_1d
.end method

.method public くし〴〺ぅ(I)V
    .registers 4

    :try_start_0
    iget-object v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    invoke-virtual {v1, p1}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->くし〴〺ぅ(I)V
    :try_end_15
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_15} :catch_17

    goto :goto_6

    :cond_16
    return-void

    :catch_17
    move-exception p1

    invoke-virtual {p0, p1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->びぐびあび(Ljava/util/ConcurrentModificationException;)V

    const/4 p1, 0x0

    goto :goto_1e

    :goto_1d
    throw p1

    :goto_1e
    goto :goto_1d
.end method

.method public げつ〴ぬぐ(I)V
    .registers 4

    :try_start_0
    iget-object v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    invoke-virtual {v1, p1}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->げつ〴ぬぐ(I)V
    :try_end_15
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_15} :catch_17

    goto :goto_6

    :cond_16
    return-void

    :catch_17
    move-exception p1

    invoke-virtual {p0, p1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;->びぐびあび(Ljava/util/ConcurrentModificationException;)V

    const/4 p1, 0x0

    goto :goto_1e

    :goto_1d
    throw p1

    :goto_1e
    goto :goto_1d
.end method

.method public final びぐびあび(Ljava/util/ConcurrentModificationException;)V
    .registers 4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
