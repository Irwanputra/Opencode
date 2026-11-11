.class public Landroidx/recyclerview/widget/RecyclerView$ごづごきえ;
.super Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3054\u3065\u3054\u304d\u3048"
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$なぎぱいぢぎ;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->なぎぱいぢぎ:Z

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->ずまげせび〳(Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;->ぁごぐすすぃ()Z

    move-result v0

    if-nez v0, :cond_1f

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_1f
    return-void
.end method
