.class public Landroidx/appcompat/app/AppCompatActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;
.implements Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$〺つふすそ;


# instance fields
.field public ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->くし〴〺ぅ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->びぐびあび(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public closeOptionsMenu()V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->ぅみぱぎぎ()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1a

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->げつ〴ぬぐ()Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_17
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1a
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->ぅみぱぎぎ()Landroidx/appcompat/app/ActionBar;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_16

    if-eqz v1, :cond_16

    invoke-virtual {v1, p1}, Landroidx/appcompat/app/ActionBar;->いいにぽつ(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 p1, 0x1

    return p1

    :cond_16
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->づざかべべ(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〳ぜぞぜべっ()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .registers 2

    sget v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〺でおいここ;->げつ〴ぬぐ:I

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぺふねづ〺()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->てぜきぽく(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onContentChanged()V
    .registers 1

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->いいにぽつ()V

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->のぷのちつ(Landroid/os/Bundle;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->へぬ〴づぞ()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x1

    if-ge v0, v1, :cond_3f

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-nez v0, :cond_3f

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    if-nez v0, :cond_3f

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_3f

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v0

    if-nez v0, :cond_3f

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_3f

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_3f

    const/4 v0, 0x1

    goto :goto_40

    :cond_3f
    const/4 v0, 0x0

    :goto_40
    if-eqz v0, :cond_43

    return v2

    .line 2
    :cond_43
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .registers 8

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/FragmentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_8

    return v0

    :cond_8
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->ぅみぱぎぎ()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v1, 0x102002c

    const/4 v2, 0x0

    if-ne p2, v1, :cond_e3

    if-eqz p1, :cond_e3

    invoke-virtual {p1}, Landroidx/appcompat/app/ActionBar;->びぐびあび()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_e3

    .line 1
    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ながふずは(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_e1

    .line 2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt p2, v1, :cond_31

    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    move-result v3

    goto :goto_46

    :cond_31
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_45

    const-string v4, "android.intent.action.MAIN"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_45

    const/4 v3, 0x1

    goto :goto_46

    :cond_45
    const/4 v3, 0x0

    :goto_46
    if-eqz v3, :cond_cf

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->じぜこほぱ()Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_57

    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ながふずは(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    :cond_57
    if-eqz p2, :cond_84

    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v3

    if-nez v3, :cond_67

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p2, v3}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v3

    .line 5
    :cond_67
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_6b
    :try_start_6b
    invoke-static {p0, v3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぃぜぶの〸ぃ(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v3

    if-eqz v3, :cond_79

    invoke-virtual {p1, v4, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v3
    :try_end_78
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6b .. :try_end_78} :catch_7d

    goto :goto_6b

    .line 6
    :cond_79
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_84

    :catch_7d
    move-exception p1

    .line 7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 8
    :cond_84
    :goto_84
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->ぉひのべい()V

    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_c7

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Landroid/content/Intent;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;

    new-instance p2, Landroid/content/Intent;

    aget-object v3, p1, v2

    invoke-direct {p2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v3, 0x1000c000

    invoke-virtual {p2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p2

    aput-object p2, p1, v2

    .line 10
    sget-object p2, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Object;

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v1, :cond_b4

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    goto :goto_b7

    :cond_b4
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivities([Landroid/content/Intent;)V

    .line 11
    :goto_b7
    :try_start_b7
    sget p1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lt p2, v1, :cond_bf

    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    goto :goto_e2

    :cond_bf
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    :try_end_c2
    .catch Ljava/lang/IllegalStateException; {:try_start_b7 .. :try_end_c2} :catch_c3

    goto :goto_e2

    .line 12
    :catch_c3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_e2

    .line 13
    :cond_c7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_cf
    if-lt p2, v1, :cond_d5

    .line 14
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    goto :goto_e2

    :cond_d5
    const/high16 p2, 0x4000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_e2

    :cond_e1
    const/4 v0, 0x0

    :goto_e2
    return v0

    :cond_e3
    return v2
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/FragmentActivity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->おぐぴう〸ず(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPostResume()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPostResume()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぇぬぎばつ()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぉざぅち〻(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStart()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ざとぅぼこ〺()V

    return-void
.end method

.method public onStop()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStop()V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->は〲ぱなで()V

    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object p2

    invoke-virtual {p2, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->びえぁぜい(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public openOptionsMenu()V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->ぅみぱぎぎ()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1a

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->ぺふねづ〺()Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_17
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1a
    return-void
.end method

.method public setContentView(I)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->でどあくず(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぶでにく〼〳(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〻ぞまぎな〻(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぇ〳〲〺すっ(I)V

    return-void
.end method

.method public ぅみぱぎぎ()Landroidx/appcompat/app/ActionBar;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぺぁあねじ()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    return-object v0
.end method

.method public ぇぬぎばつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V
    .registers 2

    return-void
.end method

.method public ぉひのべい()V
    .registers 1

    return-void
.end method

.method public ごづごきえ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;)Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;
    .registers 2

    const/4 p1, 0x0

    return-object p1
.end method

.method public じぜこほぱ()Landroid/content/Intent;
    .registers 2

    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ながふずは(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public せづっ〸ちね(Landroidx/appcompat/widget/Toolbar;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぉ〲なぱぽた(Landroidx/appcompat/widget/Toolbar;)V

    return-void
.end method

.method public てぜきぽく()Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->なぎぱいぢぎ()Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    move-result-object v0

    return-object v0
.end method

.method public どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    if-nez v0, :cond_e

    .line 1
    sget-object v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〺つふすそ:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    new-instance v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    const/4 v1, 0x0

    .line 2
    invoke-direct {v0, p0, v1, p0, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;-><init>(Landroid/content/Context;Landroid/view/Window;Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;Ljava/lang/Object;)V

    .line 3
    iput-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    :cond_e
    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->ぇぬぎばつ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    return-object v0
.end method

.method public なぶひせが()V
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぺふねづ〺()V

    return-void
.end method

.method public ぺづげぺが()V
    .registers 1

    return-void
.end method

.method public ぺふねづ〺(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V
    .registers 2

    return-void
.end method
