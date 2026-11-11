.class public Landroidx/activity/ComponentActivity;
.super Landroidx/core/app/ComponentActivity;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/ぁごぐすすぃ;
.implements Lづざかべべ/のぷのちつ/ごづごきえ;
.implements Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;
.implements Lづざかべべ/げつ〴ぬぐ/くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/ComponentActivity$〺つふすそ;
    }
.end annotation


# instance fields
.field public final くし〴〺ぅ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

.field public づざかべべ:Lづざかべべ/のぷのちつ/は〲ぱなで;

.field public final なぎぱいぢぎ:Landroidx/activity/OnBackPressedDispatcher;

.field public final びぐびあび:Lづざかべべ/ぉざぅち〻/〺つふすそ;


# direct methods
.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, Landroidx/core/app/ComponentActivity;-><init>()V

    new-instance v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    invoke-direct {v0, p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;-><init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    new-instance v1, Lづざかべべ/ぉざぅち〻/〺つふすそ;

    invoke-direct {v1, p0}, Lづざかべべ/ぉざぅち〻/〺つふすそ;-><init>(Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;)V

    .line 2
    iput-object v1, p0, Landroidx/activity/ComponentActivity;->びぐびあび:Lづざかべべ/ぉざぅち〻/〺つふすそ;

    new-instance v1, Landroidx/activity/OnBackPressedDispatcher;

    new-instance v2, Landroidx/activity/ComponentActivity$げつ〴ぬぐ;

    invoke-direct {v2, p0}, Landroidx/activity/ComponentActivity$げつ〴ぬぐ;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-direct {v1, v2}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Landroidx/activity/ComponentActivity;->なぎぱいぢぎ:Landroidx/activity/OnBackPressedDispatcher;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_2b

    new-instance v3, Landroidx/activity/ComponentActivity$2;

    invoke-direct {v3, p0}, Landroidx/activity/ComponentActivity$2;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v3}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V

    :cond_2b
    new-instance v3, Landroidx/activity/ComponentActivity$3;

    invoke-direct {v3, p0}, Landroidx/activity/ComponentActivity$3;-><init>(Landroidx/activity/ComponentActivity;)V

    invoke-virtual {v0, v3}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V

    if-gt v2, v1, :cond_41

    const/16 v2, 0x17

    if-gt v1, v2, :cond_41

    new-instance v1, Landroidx/activity/ImmLeaksCleaner;

    invoke-direct {v1, p0}, Landroidx/activity/ImmLeaksCleaner;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V

    :cond_41
    return-void
.end method

.method public static synthetic でどあくず(Landroidx/activity/ComponentActivity;)V
    .registers 1

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .registers 2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->なぎぱいぢぎ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->げつ〴ぬぐ()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->びぐびあび:Lづざかべべ/ぉざぅち〻/〺つふすそ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    invoke-static {p0}, Lづざかべべ/のぷのちつ/おぐぴう〸ず;->〺つふすそ(Landroid/app/Activity;)V

    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->づざかべべ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    if-nez v0, :cond_e

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/activity/ComponentActivity$〺つふすそ;

    if-eqz v1, :cond_e

    iget-object v0, v1, Landroidx/activity/ComponentActivity$〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    :cond_e
    if-nez v0, :cond_12

    const/4 v0, 0x0

    return-object v0

    :cond_12
    new-instance v1, Landroidx/activity/ComponentActivity$〺つふすそ;

    invoke-direct {v1}, Landroidx/activity/ComponentActivity$〺つふすそ;-><init>()V

    iput-object v0, v1, Landroidx/activity/ComponentActivity$〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    return-object v1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 2
    instance-of v1, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    if-eqz v1, :cond_b

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->びぐびあび:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 3
    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    .line 4
    :cond_b
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->びぐびあび:Lづざかべべ/ぉざぅち〻/〺つふすそ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぉざぅち〻/〺つふすそ;->〺つふすそ(Landroid/os/Bundle;)V

    return-void
.end method

.method public くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;
    .registers 2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    return-object v0
.end method

.method public final づざかべべ()Landroidx/activity/OnBackPressedDispatcher;
    .registers 2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->なぎぱいぢぎ:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public final なぎぱいぢぎ()Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;
    .registers 2

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->びぐびあび:Lづざかべべ/ぉざぅち〻/〺つふすそ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->〺つふすそ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    return-object v0
.end method

.method public は〲ぱなで()Lづざかべべ/のぷのちつ/は〲ぱなで;
    .registers 3

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Landroidx/activity/ComponentActivity;->づざかべべ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    if-nez v0, :cond_21

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/activity/ComponentActivity$〺つふすそ;

    if-eqz v0, :cond_16

    iget-object v0, v0, Landroidx/activity/ComponentActivity$〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->づざかべべ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    :cond_16
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->づざかべべ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    if-nez v0, :cond_21

    new-instance v0, Lづざかべべ/のぷのちつ/は〲ぱなで;

    invoke-direct {v0}, Lづざかべべ/のぷのちつ/は〲ぱなで;-><init>()V

    iput-object v0, p0, Landroidx/activity/ComponentActivity;->づざかべべ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    :cond_21
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->づざかべべ:Lづざかべべ/のぷのちつ/は〲ぱなで;

    return-object v0

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
