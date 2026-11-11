.class public Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public 〺つふすそ:Ljava/lang/Object;

.field public くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

.field public づざかべべ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

.field public びぐびあび:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;


# direct methods
.method public constructor <init>(Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->でどあくず:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_8

    goto :goto_c

    .line 2
    :cond_8
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->びぐびあび()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    :goto_c
    iput-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Ljava/lang/Object;

    iput-object p2, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iput-object p3, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->びぐびあび:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    iput-object p4, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->づざかべべ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    return-void
.end method

.method public constructor <init>(Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Ljava/lang/Object;

    iput-object p2, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iput-object p3, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->びぐびあび:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    iput-object p4, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->づざかべべ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 6

    iget-object p1, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget v0, p1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->びぐびあび:I

    const/4 v1, -0x1

    if-ne p2, v1, :cond_43

    iget-object p1, p1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[Ljava/lang/String;

    iget-object p2, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->づざかべべ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    if-eqz p2, :cond_10

    invoke-interface {p2, v0}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ(I)V

    :cond_10
    iget-object p2, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Ljava/lang/Object;

    instance-of v1, p2, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_2d

    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_24

    new-instance v1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/びぐびあび;

    invoke-direct {v1, p2}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/びぐびあび;-><init>(Ljava/lang/Object;)V

    goto :goto_29

    :cond_24
    new-instance v1, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/なぎぱいぢぎ;

    invoke-direct {v1, p2}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/なぎぱいぢぎ;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 2
    :goto_29
    invoke-virtual {v1, v0, p1}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ(I[Ljava/lang/String;)V

    goto :goto_5b

    :cond_2d
    instance-of v1, p2, Landroid/app/Activity;

    if-eqz v1, :cond_3b

    check-cast p2, Landroid/app/Activity;

    invoke-static {p2}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->くし〴〺ぅ(Landroid/app/Activity;)Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;

    move-result-object p2

    invoke-virtual {p2, v0, p1}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ(I[Ljava/lang/String;)V

    goto :goto_5b

    :cond_3b
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Host must be an Activity or Fragment!"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_43
    iget-object p1, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->づざかべべ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    if-eqz p1, :cond_4a

    invoke-interface {p1, v0}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ(I)V

    .line 3
    :cond_4a
    iget-object p1, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->びぐびあび:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    if-eqz p1, :cond_5b

    iget-object p2, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget v0, p2, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->びぐびあび:I

    iget-object p2, p2, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->ぺぁあねじ(ILjava/util/List;)V

    :cond_5b
    :goto_5b
    return-void
.end method
