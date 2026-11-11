.class public Landroidx/lifecycle/FullLifecycleObserverAdapter;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/のぷのちつ/づざかべべ;

.field public final げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/のぷのちつ/〺つふすそ;Lづざかべべ/のぷのちつ/づざかべべ;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;

    iput-object p2, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->〺つふすそ:Lづざかべべ/のぷのちつ/づざかべべ;

    return-void
.end method


# virtual methods
.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 4

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_3c

    goto :goto_33

    :pswitch_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ON_ANY must not been send by anybody"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_10
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;

    invoke-interface {v0, p1}, Lづざかべべ/のぷのちつ/〺つふすそ;->〺つふすそ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    goto :goto_33

    :pswitch_16
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;

    invoke-interface {v0, p1}, Lづざかべべ/のぷのちつ/〺つふすそ;->ぁごぐすすぃ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    goto :goto_33

    :pswitch_1c
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;

    invoke-interface {v0, p1}, Lづざかべべ/のぷのちつ/〺つふすそ;->づざかべべ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    goto :goto_33

    :pswitch_22
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;

    invoke-interface {v0, p1}, Lづざかべべ/のぷのちつ/〺つふすそ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    goto :goto_33

    :pswitch_28
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;

    invoke-interface {v0, p1}, Lづざかべべ/のぷのちつ/〺つふすそ;->なぎぱいぢぎ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    goto :goto_33

    :pswitch_2e
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/〺つふすそ;

    invoke-interface {v0, p1}, Lづざかべべ/のぷのちつ/〺つふすそ;->くし〴〺ぅ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    :goto_33
    iget-object v0, p0, Landroidx/lifecycle/FullLifecycleObserverAdapter;->〺つふすそ:Lづざかべべ/のぷのちつ/づざかべべ;

    if-eqz v0, :cond_3a

    invoke-interface {v0, p1, p2}, Lづざかべべ/のぷのちつ/づざかべべ;->びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    :cond_3a
    return-void

    nop

    :pswitch_data_3c
    .packed-switch 0x0
        :pswitch_2e
        :pswitch_28
        :pswitch_22
        :pswitch_1c
        :pswitch_16
        :pswitch_10
        :pswitch_8
    .end packed-switch
.end method
