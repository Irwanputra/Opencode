.class public Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;
.super Landroidx/viewpager2/widget/ViewPager2$びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3033\u305c\u305e\u305c\u3079\u3063"
.end annotation


# instance fields
.field public final 〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

.field public くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

.field public final げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

.field public final synthetic びぐびあび:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 3

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2$びぐびあび;-><init>(Landroidx/viewpager2/widget/ViewPager2;Landroidx/viewpager2/widget/ViewPager2$げつ〴ぬぐ;)V

    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$げつ〴ぬぐ;-><init>(Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$〺つふすそ;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$〺つふすそ;-><init>(Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 1

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび()V

    return-void
.end method

.method public くし〴〺ぅ(I)V
    .registers 4

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    .line 1
    iget-boolean v1, v0, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->びぐびあび(IZ)V

    :cond_a
    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/ぶでにく〼〳/くし〴〺ぅ/くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    const/4 p1, 0x2

    invoke-static {p2, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$くし〴〺ぅ;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ$くし〴〺ぅ;-><init>(Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->へぬ〴づぞ(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_19

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    :cond_19
    return-void
.end method

.method public びぐびあび()V
    .registers 9

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    const v1, 0x1020048

    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    const v2, 0x1020049

    invoke-static {v0, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    const v3, 0x1020046

    invoke-static {v0, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    const v4, 0x1020047

    invoke-static {v0, v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    iget-object v5, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v5}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v5

    if-nez v5, :cond_23

    return-void

    :cond_23
    iget-object v5, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v5}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v5

    if-nez v5, :cond_30

    return-void

    :cond_30
    iget-object v6, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    .line 1
    iget-boolean v7, v6, Landroidx/viewpager2/widget/ViewPager2;->は〲ぱなで:Z

    if-nez v7, :cond_37

    return-void

    .line 2
    :cond_37
    invoke-virtual {v6}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_75

    iget-object v3, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->〺つふすそ()Z

    move-result v3

    if-eqz v3, :cond_4a

    const v4, 0x1020048

    goto :goto_4d

    :cond_4a
    const v4, 0x1020049

    :goto_4d
    if-eqz v3, :cond_52

    const v1, 0x1020049

    :cond_52
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    iget v2, v2, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    add-int/lit8 v5, v5, -0x1

    if-ge v2, v5, :cond_64

    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v2, v4, v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v3, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

    invoke-static {v0, v2, v7, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->せづっ〸ちね(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;)V

    :cond_64
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    iget v2, v2, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    if-lez v2, :cond_97

    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v2, v1, v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

    invoke-static {v0, v2, v7, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->せづっ〸ちね(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;)V

    goto :goto_97

    :cond_75
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    iget v1, v1, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    add-int/lit8 v5, v5, -0x1

    if-ge v1, v5, :cond_87

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v1, v4, v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

    invoke-static {v0, v1, v7, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->せづっ〸ちね(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;)V

    :cond_87
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->びぐびあび:Landroidx/viewpager2/widget/ViewPager2;

    iget v1, v1, Landroidx/viewpager2/widget/ViewPager2;->づざかべべ:I

    if-lez v1, :cond_97

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v1, v3, v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;-><init>(ILjava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;

    invoke-static {v0, v1, v7, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->せづっ〸ちね(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;)V

    :cond_97
    :goto_97
    return-void
.end method
