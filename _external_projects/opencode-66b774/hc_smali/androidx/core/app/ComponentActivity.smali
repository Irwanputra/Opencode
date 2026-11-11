.class public Landroidx/core/app/ComponentActivity;
.super Landroid/app/Activity;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/ぁごぐすすぃ;
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/びぐびあび$げつ〴ぬぐ;


# instance fields
.field public 〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    invoke-direct {v0, p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;-><init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    iput-object v0, p0, Landroidx/core/app/ComponentActivity;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 4

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/びぐびあび;->げつ〴ぬぐ(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 p1, 0x1

    return p1

    :cond_12
    invoke-static {p0, v0, p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/びぐびあび;->〺つふすそ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/びぐびあび$げつ〴ぬぐ;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/びぐびあび;->げつ〴ぬぐ(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 p1, 0x1

    return p1

    :cond_12
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->〺つふすそ(Landroid/app/Activity;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 4

    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->びぐびあび:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 1
    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public ぁごぐすすぃ(Landroid/view/KeyEvent;)Z
    .registers 2

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;
    .registers 2

    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->〺つふすそ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    return-object v0
.end method
