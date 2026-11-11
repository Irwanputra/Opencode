.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
.end annotation


# instance fields
.field public final synthetic くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;Landroid/view/Window$Callback;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぷぞてのほき(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_13

    :cond_11
    const/4 p1, 0x0

    goto :goto_14

    :cond_13
    :goto_13
    const/4 p1, 0x1

    :goto_14
    return p1
.end method

.method public dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .registers 7

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_4f

    .line 2
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    .line 3
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->えがぐせほち()V

    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺぁあねじ:Landroidx/appcompat/app/ActionBar;

    if-eqz v4, :cond_1f

    .line 4
    invoke-virtual {v4, v3, p1}, Landroidx/appcompat/app/ActionBar;->ぺぁあねじ(ILandroid/view/KeyEvent;)Z

    move-result v3

    if-eqz v3, :cond_1f

    :cond_1d
    :goto_1d
    const/4 p1, 0x1

    goto :goto_4d

    :cond_1f
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->せづっ〸ちね:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    if-eqz v3, :cond_34

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    invoke-virtual {v0, v3, v4, p1, v2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺがぅす〹ち(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;ILandroid/view/KeyEvent;I)Z

    move-result v3

    if-eqz v3, :cond_34

    iget-object p1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->せづっ〸ちね:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    if-eqz p1, :cond_1d

    iput-boolean v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;->てぜきぽく:Z

    goto :goto_1d

    :cond_34
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->せづっ〸ちね:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    if-nez v3, :cond_4c

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ておぞぞはね(I)Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    move-result-object v3

    invoke-virtual {v0, v3, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->のね〱ばぁぢ(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;Landroid/view/KeyEvent;)Z

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    invoke-virtual {v0, v3, v4, p1, v2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺがぅす〹ち(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;ILandroid/view/KeyEvent;I)Z

    move-result p1

    iput-boolean v1, v3, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;->ぺふねづ〺:Z

    if-eqz p1, :cond_4c

    goto :goto_1d

    :cond_4c
    const/4 p1, 0x0

    :goto_4d
    if-eqz p1, :cond_50

    :cond_4f
    const/4 v1, 0x1

    :cond_50
    return v1
.end method

.method public onContentChanged()V
    .registers 1

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .registers 4

    if-nez p1, :cond_8

    instance-of v0, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-nez v0, :cond_8

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_8
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 2
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x6c

    const/4 v1, 0x1

    if-ne p1, v0, :cond_19

    .line 4
    invoke-virtual {p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->えがぐせほち()V

    iget-object p1, p2, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺぁあねじ:Landroidx/appcompat/app/ActionBar;

    if-eqz p1, :cond_19

    .line 5
    invoke-virtual {p1, v1}, Landroidx/appcompat/app/ActionBar;->くし〴〺ぅ(Z)V

    :cond_19
    return v1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 2
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_1a

    .line 4
    invoke-virtual {p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->えがぐせほち()V

    iget-object p1, p2, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺぁあねじ:Landroidx/appcompat/app/ActionBar;

    if-eqz p1, :cond_27

    .line 5
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->くし〴〺ぅ(Z)V

    goto :goto_27

    :cond_1a
    if-nez p1, :cond_27

    invoke-virtual {p2, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ておぞぞはね(I)Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    move-result-object p1

    iget-boolean v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;->のぷのちつ:Z

    if-eqz v1, :cond_27

    invoke-virtual {p2, p1, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉひのべい(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;Z)V

    :cond_27
    :goto_27
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .registers 7

    instance-of v0, p3, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_8

    move-object v0, p3

    check-cast v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    const/4 v1, 0x0

    if-nez p1, :cond_f

    if-nez v0, :cond_f

    return v1

    :cond_f
    if-eqz v0, :cond_14

    const/4 v2, 0x1

    .line 1
    iput-boolean v2, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〻ぞまぎな〻:Z

    .line 2
    :cond_14
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz v0, :cond_1e

    .line 3
    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〻ぞまぎな〻:Z

    :cond_1e
    return p1
.end method

.method public onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/KeyboardShortcutGroup;",
            ">;",
            "Landroid/view/Menu;",
            "I)V"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ておぞぞはね(I)Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;

    move-result-object v0

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺふねづ〺;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_11

    .line 1
    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {p2, p1, v0, p3}, Landroid/view/Window$Callback;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    goto :goto_16

    :cond_11
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Window$Callback;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    :goto_16
    return-void
.end method

.method public onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_8

    const/4 p1, 0x0

    return-object p1

    :cond_8
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 1
    iget-boolean v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ごづごきえ:Z

    if-eqz v0, :cond_13

    .line 2
    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->げつ〴ぬぐ(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 3
    :cond_13
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 4
    iget-boolean v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ごづごきえ:Z

    if-eqz v0, :cond_e

    if-eqz p2, :cond_9

    goto :goto_e

    .line 5
    :cond_9
    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->げつ〴ぬぐ(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    .line 6
    :cond_e
    :goto_e
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public final げつ〴ぬぐ(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .registers 11

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->づざかべべ:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$なぎぱいぢぎ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;->くし〴〺ぅ()V

    :cond_15
    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;

    invoke-direct {v1, p1, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;)V

    .line 2
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->えがぐせほち()V

    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺぁあねじ:Landroidx/appcompat/app/ActionBar;

    if-eqz v2, :cond_30

    .line 3
    invoke-virtual {v2, v1}, Landroidx/appcompat/app/ActionBar;->は〲ぱなで(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;)Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    move-result-object v2

    iput-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    if-eqz v2, :cond_30

    iget-object v3, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;

    if-eqz v3, :cond_30

    invoke-interface {v3, v2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;->ぺふねづ〺(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    :cond_30
    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    const/4 v3, 0x0

    if-nez v2, :cond_198

    .line 4
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おかぷせ〱()V

    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    if-eqz v2, :cond_3f

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;->くし〴〺ぅ()V

    :cond_3f
    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;

    if-eqz v2, :cond_4c

    iget-boolean v4, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇとしたべど:Z

    if-nez v4, :cond_4c

    :try_start_47
    invoke-interface {v2, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;)Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    move-result-object v2
    :try_end_4b
    .catch Ljava/lang/AbstractMethodError; {:try_start_47 .. :try_end_4b} :catch_4c

    goto :goto_4d

    :catch_4c
    :cond_4c
    move-object v2, v3

    :goto_4d
    if-eqz v2, :cond_53

    iput-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    goto/16 :goto_189

    :cond_53
    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v2, :cond_fe

    iget-boolean v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぅみぱぎぎ:Z

    if-eqz v2, :cond_df

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    iget-object v6, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    sget v7, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarTheme:I

    invoke-virtual {v6, v7, v2, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v7, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_92

    iget-object v7, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v6, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v7, v6, v4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v6, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;

    iget-object v8, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->づざかべべ:Landroid/content/Context;

    invoke-direct {v6, v8, v5}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v6}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_94

    :cond_92
    iget-object v6, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->づざかべべ:Landroid/content/Context;

    :goto_94
    new-instance v7, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v7, v6}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v7, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v7, Landroid/widget/PopupWindow;

    sget v8, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionModePopupWindowStyle:I

    invoke-direct {v7, v6, v3, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v7, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    const/4 v8, 0x2

    invoke-static {v7, v8}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぱでかぁ〻〹(Landroid/widget/PopupWindow;I)V

    iget-object v7, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    iget-object v8, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v7, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    const/4 v8, -0x1

    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    sget v8, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarSize:I

    invoke-virtual {v7, v8, v2, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v2, v2, Landroid/util/TypedValue;->data:I

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v2

    iget-object v6, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    const/4 v6, -0x2

    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;

    invoke-direct {v2, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぇぬぎばつ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V

    iput-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ざとぅぼこ〺:Ljava/lang/Runnable;

    goto :goto_fe

    :cond_df
    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->でどあくず:Landroid/view/ViewGroup;

    sget v6, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_mode_bar_stub:I

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v2, :cond_fe

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ながふずは()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {v2}, Landroidx/appcompat/widget/ViewStubCompat;->げつ〴ぬぐ()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_fe
    :goto_fe
    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v2, :cond_189

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おかぷせ〱()V

    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->〳ぜぞぜべっ()V

    new-instance v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;

    iget-object v6, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v6

    iget-object v7, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v8, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    if-nez v8, :cond_119

    goto :goto_11a

    :cond_119
    const/4 v4, 0x0

    :goto_11a
    invoke-direct {v2, v6, v7, v1, v4}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;Z)V

    .line 5
    iget-object v4, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 6
    invoke-virtual {v1, v2, v4}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$づざかべべ;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_187

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぺぁあねじ()V

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->なぎぱいぢぎ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    iput-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->くねねぱす〻()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_151

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    move-result-object v1

    invoke-virtual {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ(F)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iput-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->は〲ぱなで:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    new-instance v2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぉざぅち〻;

    invoke-direct {v2, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぉざぅち〻;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V

    invoke-virtual {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->びぐびあび(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    goto :goto_177

    :cond_151
    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_177

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぇぬぎばつ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    :cond_177
    :goto_177
    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぉざぅち〻:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_189

    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->なぎぱいぢぎ:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ざとぅぼこ〺:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_189

    :cond_187
    iput-object v3, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    :cond_189
    :goto_189
    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    if-eqz v1, :cond_194

    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;

    if-eqz v2, :cond_194

    invoke-interface {v2, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;->ぺふねづ〺(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    :cond_194
    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    .line 7
    iput-object v1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    :cond_198
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->おぐぴう〸ず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    if-eqz p1, :cond_1a1

    .line 8
    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_1a1
    return-object v3
.end method
