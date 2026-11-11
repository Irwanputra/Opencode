.class public Lteam/dev/epro/apkcustom/widgets/logger/LogView;
.super Landroid/widget/ListView;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;


# instance fields
.field public 〺つふすそ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ:Ljava/util/ArrayList;

    new-instance p1, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ:Ljava/util/ArrayList;

    const v1, 0x7f0c005b

    invoke-direct {p1, p2, v1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->くし〴〺ぅ:Landroid/widget/ArrayAdapter;

    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method


# virtual methods
.method public getArrayList()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getNext()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;

    return-object v0
.end method

.method public setNext(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;

    return-void
.end method

.method public final 〺つふすそ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .registers 5

    if-eqz p2, :cond_10

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_a

    const-string p3, ""

    :cond_a
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_10
    return-object p1
.end method

.method public くし〴〺ぅ()V
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->くし〴〺ぅ:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->くし〴〺ぅ:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public げつ〴ぬぐ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 9

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_7c

    move-object v1, v0

    goto :goto_47

    :pswitch_6
    const-string v1, "L1<\u001cc:Hj;@0=Me=KclMcfM6jN4jN7;\u001de"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_47

    :pswitch_11
    const-string v1, "Og<\u001ddfLglAboHdnAejL1>Icg@0=N4lJa"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_47

    :pswitch_1c
    const-string v1, "\u001cdiM`hAgkHd:\u001cc=J09I6hAggM6j@kjMc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_47

    :pswitch_27
    const-string v1, "Oe;\u001ca<\u00190i\u001d1f\u001ce<Kgn\u001a3<Ig>H7:Od>@j"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_47

    :pswitch_32
    const-string v1, "\u001a4<\u0019j>\u001ccmOc<\u001b3kLgnNgg\u001d49@6j\u001a6l\u001aa"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_47

    :pswitch_3d
    const-string v1, "HfhH`k\u001egi@doKbhH1i@koM3fOjfNd:\u001bd"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_47
    if-eqz p4, :cond_4d

    invoke-static {p4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    :cond_4d
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\t"

    invoke-virtual {p0, v2, v1, v3}, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, p2, v3}, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, p3, v3}, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v0, v3}, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->〺つふすそ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Ljava/lang/Thread;

    new-instance v3, Lteam/dev/epro/apkcustom/widgets/logger/LogView$げつ〴ぬぐ;

    invoke-direct {v3, p0, v2}, Lteam/dev/epro/apkcustom/widgets/logger/LogView$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/widgets/logger/LogView;Ljava/lang/StringBuilder;)V

    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/logger/LogView;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_7a

    invoke-interface {v0, p1, p2, p3, p4}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7a
    return-void

    nop

    :pswitch_data_7c
    .packed-switch 0x2
        :pswitch_3d
        :pswitch_32
        :pswitch_27
        :pswitch_1c
        :pswitch_11
        :pswitch_6
    .end packed-switch
.end method
