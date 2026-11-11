.class public Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/ごづごきえ;
.implements Lづざかべべ/げつ〴ぬぐ/くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043<",
        "Landroidx/fragment/app/FragmentActivity;",
        ">;",
        "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3054\u3065\u3054\u304d\u3048;",
        "L\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050/\u304f\u3057\u3034\u303a\u3045;"
    }
.end annotation


# instance fields
.field public final synthetic ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .registers 2

    iput-object p1, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-direct {p0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    return-object v0
.end method

.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    return v0
.end method

.method public ぁごぐすすぃ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .registers 6

    iget-object p2, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, p3, p4}, Landroidx/fragment/app/FragmentActivity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public いいにぽつ()I
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_a

    const/4 v0, 0x0

    goto :goto_10

    :cond_a
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    :goto_10
    return v0
.end method

.method public ぇぬぎばつ()V
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->なぶひせが()V

    return-void
.end method

.method public おぐぴう〸ず(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .registers 10

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    const/4 v1, 0x1

    .line 1
    iput-boolean v1, v0, Landroidx/fragment/app/FragmentActivity;->のぷのちつ:Z

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/16 v4, 0x10

    if-ne p3, v2, :cond_19

    .line 2
    :try_start_b
    sget p1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v4, :cond_15

    invoke-virtual {v0, p2, v2, p4}, Landroidx/fragment/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    goto :goto_34

    :cond_15
    invoke-virtual {v0, p2, v2}, Landroidx/fragment/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_34

    .line 3
    :cond_19
    invoke-static {p3}, Landroidx/fragment/app/FragmentActivity;->〻ぞまぎな〻(I)V

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentActivity;->ぶでにく〼〳(Landroidx/fragment/app/Fragment;)I

    move-result p1

    add-int/2addr p1, v1

    shl-int/2addr p1, v4

    const v1, 0xffff

    and-int/2addr p3, v1

    add-int/2addr p1, p3

    .line 4
    sget p3, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p3, v4, :cond_31

    invoke-virtual {v0, p2, p1, p4}, Landroidx/fragment/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    goto :goto_34

    :cond_31
    invoke-virtual {v0, p2, p1}, Landroidx/fragment/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_34
    .catchall {:try_start_b .. :try_end_34} :catchall_37

    .line 5
    :goto_34
    iput-boolean v3, v0, Landroidx/fragment/app/FragmentActivity;->のぷのちつ:Z

    return-void

    :catchall_37
    move-exception p1

    iput-boolean v3, v0, Landroidx/fragment/app/FragmentActivity;->のぷのちつ:Z

    throw p1
.end method

.method public くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    iget-object v0, v0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    return-object v0
.end method

.method public げつ〴ぬぐ(I)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public づざかべべ()Landroidx/activity/OnBackPressedDispatcher;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    .line 1
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->なぎぱいぢぎ:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public てぜきぽく(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V
    .registers 7

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    if-ne p3, v1, :cond_c

    invoke-static {v0, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->びぐびあび(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_24

    :cond_c
    invoke-static {p3}, Landroidx/fragment/app/FragmentActivity;->〻ぞまぎな〻(I)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_11
    iput-boolean v2, v0, Landroidx/fragment/app/FragmentActivity;->てぜきぽく:Z

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentActivity;->ぶでにく〼〳(Landroidx/fragment/app/Fragment;)I

    move-result p1

    add-int/2addr p1, v2

    shl-int/lit8 p1, p1, 0x10

    const v2, 0xffff

    and-int/2addr p3, v2

    add-int/2addr p1, p3

    invoke-static {v0, p2, p1}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->びぐびあび(Landroid/app/Activity;[Ljava/lang/String;I)V
    :try_end_22
    .catchall {:try_start_11 .. :try_end_22} :catchall_25

    iput-boolean v1, v0, Landroidx/fragment/app/FragmentActivity;->てぜきぽく:Z

    :goto_24
    return-void

    :catchall_25
    move-exception p1

    iput-boolean v1, v0, Landroidx/fragment/app/FragmentActivity;->てぜきぽく:Z

    throw p1
.end method

.method public のぷのちつ(Landroidx/fragment/app/Fragment;)Z
    .registers 2

    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public は〲ぱなで()Lづざかべべ/のぷのちつ/は〲ぱなで;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->は〲ぱなで()Lづざかべべ/のぷのちつ/は〲ぱなで;

    move-result-object v0

    return-object v0
.end method

.method public びぐびあび(Landroidx/fragment/app/Fragment;)V
    .registers 2

    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->びえぁぜい()V

    return-void
.end method

.method public へぬ〴づぞ(Ljava/lang/String;)Z
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->づざかべべ(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ぺぁあねじ()Landroid/view/LayoutInflater;
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public ぺふねづ〺()Z
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;->ぁごぐすすぃ:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method
