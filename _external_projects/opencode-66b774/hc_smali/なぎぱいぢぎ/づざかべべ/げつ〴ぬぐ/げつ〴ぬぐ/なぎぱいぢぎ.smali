.class public Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Z

.field public final synthetic くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionMenu;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionMenu;Z)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionMenu;

    iput-boolean p2, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-boolean v0, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionMenu;

    .line 1
    iget-object v1, v0, Lcom/github/clans/fab/FloatingActionMenu;->ぺがぅす〹ち:Landroid/view/animation/Animation;

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_b
    iget-object v0, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionMenu;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object v0, p0, Lなぎぱいぢぎ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionMenu;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, v0, Lcom/github/clans/fab/FloatingActionMenu;->のね〱ばぁぢ:Z

    return-void
.end method
