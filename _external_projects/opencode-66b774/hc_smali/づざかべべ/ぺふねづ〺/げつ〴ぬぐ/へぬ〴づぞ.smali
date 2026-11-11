.class public abstract Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;
.super Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;
.source ""


# instance fields
.field public final くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

.field public づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

.field public なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

.field public final びぐびあび:I


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    const/4 p1, 0x0

    iput p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->びぐびあび:I

    return-void
.end method

.method public static のぷのちつ(IJ)Ljava/lang/String;
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android:switcher:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/ViewGroup;)V
    .registers 2

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->びぐびあび()V

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_a
    return-void
.end method

.method public ぁごぐすすぃ(Landroid/view/View;Ljava/lang/Object;)Z
    .registers 3

    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 1
    iget-object p2, p2, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-ne p2, p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, 0x0

    :goto_9
    return p1
.end method

.method public いいにぽつ()Landroid/os/Parcelable;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public げつ〴ぬぐ(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .registers 4

    check-cast p3, Landroidx/fragment/app/Fragment;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez p1, :cond_14

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {p2, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 2
    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_14
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    invoke-virtual {p1, p3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->づざかべべ(Landroidx/fragment/app/Fragment;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    if-ne p3, p1, :cond_20

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    :cond_20
    return-void
.end method

.method public てぜきぽく(Landroid/view/ViewGroup;)V
    .registers 4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_8

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewPager with adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " requires a view id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public なぎぱいぢぎ(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .registers 8

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez v0, :cond_12

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 2
    iput-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_12
    int-to-long v0, p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p2

    invoke-static {p2, v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->のぷのちつ(IJ)Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    invoke-virtual {v2, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p2

    const/4 v2, 0x1

    if-eqz p2, :cond_30

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    .line 3
    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p1, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;)V

    goto :goto_4c

    .line 4
    :cond_30
    move-object p2, p0

    check-cast p2, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;

    .line 5
    new-instance v3, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;

    invoke-direct {v3}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;-><init>()V

    iput-object v3, p2, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;

    .line 6
    iget-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    invoke-static {p1, v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->のぷのちつ(IJ)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-virtual {p2, v4, v3, p1, v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->なぎぱいぢぎ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    move-object p2, v3

    .line 8
    :goto_4c
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    if-eq p2, p1, :cond_63

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroidx/fragment/app/Fragment;->きぬどぼみ〸(Z)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->びぐびあび:I

    if-ne v0, v2, :cond_60

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->づざかべべ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {p1, p2, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    goto :goto_63

    :cond_60
    invoke-virtual {p2, p1}, Landroidx/fragment/app/Fragment;->びちづぼぬ(Z)V

    :cond_63
    :goto_63
    return-object p2
.end method

.method public ぺぁあねじ(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .registers 3

    return-void
.end method

.method public ぺふねづ〺(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .registers 6

    check-cast p3, Landroidx/fragment/app/Fragment;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    if-eq p3, p1, :cond_58

    const/4 p2, 0x1

    if-eqz p1, :cond_32

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->きぬどぼみ〸(Z)V

    iget p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->びぐびあび:I

    if-ne p1, p2, :cond_2d

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez p1, :cond_23

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_23
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->づざかべべ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {p1, v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    goto :goto_32

    :cond_2d
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->びちづぼぬ(Z)V

    :cond_32
    :goto_32
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->きぬどぼみ〸(Z)V

    iget p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->びぐびあび:I

    if-ne p1, p2, :cond_53

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez p1, :cond_4b

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {p2, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 4
    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_4b
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    sget-object p2, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {p1, p3, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    goto :goto_56

    :cond_53
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->びちづぼぬ(Z)V

    :goto_56
    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/へぬ〴づぞ;->なぎぱいぢぎ:Landroidx/fragment/app/Fragment;

    :cond_58
    return-void
.end method
