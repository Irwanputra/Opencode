.class public final Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;
.super Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public final 〺つふすそ:Landroidx/viewpager2/widget/ViewPager2;

.field public ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

.field public いいにぽつ:Z

.field public final くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView;

.field public げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

.field public づざかべべ:I

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Z

.field public final びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public ぺぁあねじ:I

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〺つふすそ:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->ぺふねづ〺:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iput-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    new-instance p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {p1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-virtual {p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 8

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺふねづ〺:Z

    invoke-virtual {p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ()V

    iget-boolean v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->いいにぽつ:Z

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_3a

    iput-boolean v1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->いいにぽつ:Z

    if-gtz p3, :cond_22

    if-nez p3, :cond_20

    if-gez p2, :cond_16

    const/4 p2, 0x1

    goto :goto_17

    :cond_16
    const/4 p2, 0x0

    :goto_17
    iget-object p3, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〺つふすそ:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p3}, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ()Z

    move-result p3

    if-ne p2, p3, :cond_20

    goto :goto_22

    :cond_20
    const/4 p2, 0x0

    goto :goto_23

    :cond_22
    :goto_22
    const/4 p2, 0x1

    :goto_23
    if-eqz p2, :cond_2f

    iget-object p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget p3, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-eqz p3, :cond_2f

    iget p2, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    add-int/2addr p2, p1

    goto :goto_33

    :cond_2f
    iget-object p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget p2, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    :goto_33
    iput p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    iget p3, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    if-eq p3, p2, :cond_48

    goto :goto_45

    :cond_3a
    iget p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:I

    if-nez p2, :cond_48

    iget-object p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget p2, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-ne p2, v2, :cond_45

    const/4 p2, 0x0

    :cond_45
    :goto_45
    invoke-virtual {p0, p2}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ(I)V

    :cond_48
    iget-object p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget p3, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-ne p3, v2, :cond_4f

    const/4 p3, 0x0

    :cond_4f
    iget v0, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:F

    iget p2, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:I

    .line 1
    iget-object v3, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    if-eqz v3, :cond_5a

    invoke-virtual {v3, p3, v0, p2}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->〺つふすそ(IFI)V

    .line 2
    :cond_5a
    iget-object p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget p3, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    iget v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    if-eq p3, v0, :cond_64

    if-ne v0, v2, :cond_72

    :cond_64
    iget p2, p2, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-nez p2, :cond_72

    iget p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    if-eq p2, p1, :cond_72

    invoke-virtual {p0, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび(I)V

    invoke-virtual {p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ()V

    :cond_72
    return-void
.end method

.method public final くし〴〺ぅ(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->くし〴〺ぅ(I)V

    :cond_7
    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 9

    iget p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne p1, v0, :cond_b

    iget v3, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    if-eq v3, v0, :cond_2a

    :cond_b
    if-ne p2, v0, :cond_2a

    .line 1
    iput-boolean v1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->のぷのちつ:Z

    iput v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:I

    iget p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    if-eq p1, v2, :cond_1a

    iput p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iput v2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    goto :goto_26

    :cond_1a
    iget p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    if-ne p1, v2, :cond_26

    .line 2
    iget-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->えげて〱でく()I

    move-result p1

    .line 3
    iput p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    :cond_26
    :goto_26
    invoke-virtual {p0, v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび(I)V

    return-void

    :cond_2a
    const/4 v3, 0x4

    if-eq p1, v0, :cond_32

    if-ne p1, v3, :cond_30

    goto :goto_32

    :cond_30
    const/4 v4, 0x0

    goto :goto_33

    :cond_32
    :goto_32
    const/4 v4, 0x1

    :goto_33
    const/4 v5, 0x2

    if-eqz v4, :cond_42

    if-ne p2, v5, :cond_42

    .line 4
    iget-boolean p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺふねづ〺:Z

    if-eqz p1, :cond_41

    invoke-virtual {p0, v5}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび(I)V

    iput-boolean v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->いいにぽつ:Z

    :cond_41
    return-void

    :cond_42
    if-eq p1, v0, :cond_49

    if-ne p1, v3, :cond_47

    goto :goto_49

    :cond_47
    const/4 p1, 0x0

    goto :goto_4a

    :cond_49
    :goto_49
    const/4 p1, 0x1

    :goto_4a
    if-eqz p1, :cond_7d

    if-nez p2, :cond_7d

    invoke-virtual {p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ()V

    iget-boolean p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺふねづ〺:Z

    if-nez p1, :cond_64

    iget-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-eq p1, v2, :cond_75

    const/4 v3, 0x0

    .line 5
    iget-object v4, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    if-eqz v4, :cond_75

    invoke-virtual {v4, p1, v3, v1}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->〺つふすそ(IFI)V

    goto :goto_75

    .line 6
    :cond_64
    iget-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget v3, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-nez v3, :cond_74

    iget v3, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iget p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-eq v3, p1, :cond_75

    invoke-virtual {p0, p1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ(I)V

    goto :goto_75

    :cond_74
    const/4 v0, 0x0

    :cond_75
    :goto_75
    if-eqz v0, :cond_7d

    invoke-virtual {p0, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび(I)V

    invoke-virtual {p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ()V

    :cond_7d
    iget p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:I

    if-ne p1, v5, :cond_a2

    if-nez p2, :cond_a2

    iget-boolean p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->てぜきぽく:Z

    if-eqz p1, :cond_a2

    invoke-virtual {p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ()V

    iget-object p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget p2, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-nez p2, :cond_a2

    iget p2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    iget p1, p1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-eq p2, p1, :cond_9c

    if-ne p1, v2, :cond_99

    const/4 p1, 0x0

    :cond_99
    invoke-virtual {p0, p1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ(I)V

    :cond_9c
    invoke-virtual {p0, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび(I)V

    invoke-virtual {p0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ()V

    :cond_a2
    return-void
.end method

.method public final づざかべべ()V
    .registers 3

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:I

    iput v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    iget-object v1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ()V

    const/4 v1, -0x1

    iput v1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iput v1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺぁあねじ:I

    iput-boolean v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->いいにぽつ:Z

    iput-boolean v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぺふねづ〺:Z

    iput-boolean v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->のぷのちつ:Z

    iput-boolean v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->てぜきぽく:Z

    return-void
.end method

.method public final なぎぱいぢぎ()V
    .registers 14

    iget-object v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget-object v1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->えげて〱でく()I

    move-result v1

    iput v1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_11

    invoke-virtual {v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ()V

    return-void

    :cond_11
    iget-object v2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1d

    invoke-virtual {v0}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ()V

    return-void

    :cond_1d
    iget-object v2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 2
    iget-object v3, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 4
    iget-object v4, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 6
    iget-object v5, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    instance-of v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v7, :cond_6f

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v7

    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v7

    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v4, v7

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v5, v6

    :cond_6f
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v4

    add-int/2addr v6, v5

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v5, v2

    add-int/2addr v5, v3

    iget-object v3, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 9
    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v3, :cond_85

    const/4 v3, 0x1

    goto :goto_86

    :cond_85
    const/4 v3, 0x0

    :goto_86
    if-eqz v3, :cond_9f

    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v1, v2

    iget-object v2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->〺つふすそ:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ()Z

    move-result v2

    if-eqz v2, :cond_9d

    neg-int v1, v1

    :cond_9d
    move v6, v5

    goto :goto_ab

    :cond_9f
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v1, v4

    iget-object v2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    :goto_ab
    neg-int v1, v1

    iput v1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-gez v1, :cond_1a3

    new-instance v1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;

    iget-object v2, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, v2}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    .line 11
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v2

    if-nez v2, :cond_bf

    goto/16 :goto_154

    :cond_bf
    iget-object v3, v1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 12
    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez v3, :cond_c7

    const/4 v3, 0x1

    goto :goto_c8

    :cond_c7
    const/4 v3, 0x0

    :goto_c8
    const/4 v4, 0x2

    new-array v5, v4, [I

    aput v4, v5, v8

    aput v2, v5, v7

    .line 13
    const-class v4, I

    invoke-static {v4, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    const/4 v5, 0x0

    :goto_d8
    if-ge v5, v2, :cond_122

    iget-object v6, v1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_11a

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    instance-of v10, v9, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v10, :cond_ed

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_ef

    :cond_ed
    sget-object v9, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;->〺つふすそ:Landroid/view/ViewGroup$MarginLayoutParams;

    :goto_ef
    aget-object v10, v4, v5

    if-eqz v3, :cond_fa

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v11

    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_100

    :cond_fa
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v11

    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :goto_100
    sub-int/2addr v11, v12

    aput v11, v10, v7

    aget-object v10, v4, v5

    if-eqz v3, :cond_10e

    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v6

    iget v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_114

    :cond_10e
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v6

    iget v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :goto_114
    add-int/2addr v6, v9

    aput v6, v10, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_d8

    :cond_11a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "null view contained in the view hierarchy"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_122
    new-instance v3, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/げつ〴ぬぐ;

    invoke-direct {v3, v1}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;)V

    invoke-static {v4, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 v3, 0x1

    :goto_12b
    if-ge v3, v2, :cond_13d

    add-int/lit8 v5, v3, -0x1

    aget-object v5, v4, v5

    aget v5, v5, v8

    aget-object v6, v4, v3

    aget v6, v6, v7

    if-eq v5, v6, :cond_13a

    goto :goto_156

    :cond_13a
    add-int/lit8 v3, v3, 0x1

    goto :goto_12b

    :cond_13d
    aget-object v3, v4, v7

    aget v3, v3, v8

    aget-object v5, v4, v7

    aget v5, v5, v7

    sub-int/2addr v3, v5

    aget-object v5, v4, v7

    aget v5, v5, v7

    if-gtz v5, :cond_156

    sub-int/2addr v2, v8

    aget-object v2, v4, v2

    aget v2, v2, v8

    if-ge v2, v3, :cond_154

    goto :goto_156

    :cond_154
    :goto_154
    const/4 v2, 0x1

    goto :goto_157

    :cond_156
    :goto_156
    const/4 v2, 0x0

    :goto_157
    if-eqz v2, :cond_161

    .line 14
    iget-object v2, v1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v2

    if-gt v2, v8, :cond_180

    .line 15
    :cond_161
    iget-object v2, v1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v2

    const/4 v3, 0x0

    :goto_168
    if-ge v3, v2, :cond_17b

    iget-object v4, v1, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_178

    const/4 v1, 0x1

    goto :goto_17c

    :cond_178
    add-int/lit8 v3, v3, 0x1

    goto :goto_168

    :cond_17b
    const/4 v1, 0x0

    :goto_17c
    if-eqz v1, :cond_180

    const/4 v1, 0x1

    goto :goto_181

    :cond_180
    const/4 v1, 0x0

    :goto_181
    if-eqz v1, :cond_18b

    .line 16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18b
    new-instance v1, Ljava/lang/IllegalStateException;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v3, v8, [Ljava/lang/Object;

    iget v0, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v7

    const-string v0, "Page can only be offset by a positive amount, not by %d"

    invoke-static {v2, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1a3
    if-nez v6, :cond_1a7

    const/4 v1, 0x0

    goto :goto_1aa

    :cond_1a7
    int-to-float v1, v1

    int-to-float v2, v6

    div-float/2addr v1, v2

    :goto_1aa
    iput v1, v0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:F

    return-void
.end method

.method public final びぐびあび(I)V
    .registers 4

    iget v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_a

    iget v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    if-nez v0, :cond_a

    return-void

    :cond_a
    iget v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    if-ne v0, p1, :cond_f

    return-void

    :cond_f
    iput p1, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    iget-object v0, p0, Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;

    if-eqz v0, :cond_18

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2$ぁごぐすすぃ;->げつ〴ぬぐ(I)V

    :cond_18
    return-void
.end method
