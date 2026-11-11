.class public abstract Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u307a\u3041\u3042\u306d\u3058"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;,
        Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$げつ〴ぬぐ;,
        Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$〺つふすそ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$\u307a\u3041\u3042\u306d\u3058$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:J

.field public げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$〺つふすそ;

.field public づざかべべ:J

.field public なぎぱいぢぎ:J

.field public びぐびあび:J


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$〺つふすそ;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->〺つふすそ:Ljava/util/ArrayList;

    const-wide/16 v0, 0x78

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->くし〴〺ぅ:J

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->びぐびあび:J

    const-wide/16 v0, 0xfa

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->づざかべべ:J

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->なぎぱいぢぎ:J

    return-void
.end method

.method public static 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)I
    .registers 4

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v0, v0, 0xe

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 p0, 0x4

    return p0

    :cond_c
    and-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_1f

    .line 1
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび:I

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ()I

    move-result p0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1f

    if-eq p0, v2, :cond_1f

    if-eq v1, p0, :cond_1f

    or-int/lit16 v0, v0, 0x800

    :cond_1f
    return v0
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u3067\u3069\u3042\u304f\u305a;",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/recyclerview/widget/RecyclerView$\u307a\u3041\u3042\u306d\u3058$\u304f\u3057\u3034\u303a\u3045;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;-><init>()V

    .line 2
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    return-object v0
.end method

.method public abstract ぁごぐすすぃ()Z
.end method

.method public final くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V
    .registers 10

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$〺つふすそ;

    if-eqz v0, :cond_7d

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$いいにぽつ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ごづごきえ(Z)V

    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    const/4 v3, 0x0

    if-eqz v2, :cond_18

    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺぁあねじ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    if-nez v2, :cond_18

    iput-object v3, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    :cond_18
    iput-object v3, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺぁあねじ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 2
    iget v2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v2, v2, 0x10

    const/4 v3, 0x0

    if-eqz v2, :cond_23

    const/4 v2, 0x1

    goto :goto_24

    :cond_23
    const/4 v2, 0x0

    :goto_24
    if-nez v2, :cond_7d

    .line 3
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView$いいにぽつ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 4
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->ぉねぞはがぞ()V

    iget-object v5, v2, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    .line 5
    iget-object v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 6
    iget-object v6, v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_40

    .line 7
    invoke-virtual {v5, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->てぜきぽく(Landroid/view/View;)Z

    goto :goto_59

    :cond_40
    iget-object v7, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->びぐびあび(I)Z

    move-result v7

    if-eqz v7, :cond_58

    iget-object v7, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ(I)Z

    invoke-virtual {v5, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->てぜきぽく(Landroid/view/View;)Z

    iget-object v5, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v5, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->くし〴〺ぅ(I)V

    goto :goto_59

    :cond_58
    const/4 v1, 0x0

    :goto_59
    if-eqz v1, :cond_69

    .line 8
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v4

    iget-object v5, v2, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    iget-object v5, v2, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :cond_69
    xor-int/lit8 v4, v1, 0x1

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->しぷげへが(Z)V

    if-nez v1, :cond_7d

    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず()Z

    move-result v1

    if-eqz v1, :cond_7d

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$いいにぽつ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v0, p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_7d
    return-void
.end method

.method public abstract げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;)Z
.end method

.method public abstract づざかべべ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V
.end method

.method public abstract なぎぱいぢぎ()V
.end method

.method public final びぐびあび()V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_17

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$げつ〴ぬぐ;

    invoke-interface {v2}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_17
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
