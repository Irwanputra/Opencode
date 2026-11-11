.class public Lづざかべべ/のぷのちつ/おぐぴう〸ず;
.super Landroid/app/Fragment;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static 〺つふすそ(Landroid/app/Activity;)V
    .registers 4

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_1f

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    new-instance v2, Lづざかべべ/のぷのちつ/おぐぴう〸ず;

    invoke-direct {v2}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;-><init>()V

    invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1f
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_CREATE:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p0, p1}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public onDestroy()V
    .registers 2

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_DESTROY:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p0, v0}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public onPause()V
    .registers 2

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_PAUSE:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p0, v0}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public onResume()V
    .registers 2

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_RESUME:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p0, v0}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public onStart()V
    .registers 2

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_START:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p0, v0}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public onStop()V
    .registers 2

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_STOP:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p0, v0}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public final げつ〴ぬぐ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 4

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    instance-of v1, v0, Lづざかべべ/のぷのちつ/ぺぁあねじ;

    if-eqz v1, :cond_12

    check-cast v0, Lづざかべべ/のぷのちつ/ぺぁあねじ;

    invoke-interface {v0}, Lづざかべべ/のぷのちつ/ぺぁあねじ;->くし〴〺ぅ()Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void

    :cond_12
    instance-of v1, v0, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    if-eqz v1, :cond_25

    check-cast v0, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    invoke-interface {v0}, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;->くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;

    move-result-object v0

    instance-of v1, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    if-eqz v1, :cond_25

    check-cast v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    invoke-virtual {v0, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    :cond_25
    return-void
.end method
