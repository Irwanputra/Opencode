.class public abstract Landroidx/recyclerview/widget/RecyclerView$びぐびあび;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VH:",
        "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public final げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$づざかべべ;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)J
    .registers 4

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public くし〴〺ぅ(I)I
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public abstract げつ〴ぬぐ()I
.end method

.method public abstract づざかべべ(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)TVH;"
        }
    .end annotation
.end method

.method public なぎぱいぢぎ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;)V"
        }
    .end annotation

    return-void
.end method

.method public abstract びぐびあび(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I)V"
        }
    .end annotation
.end method
