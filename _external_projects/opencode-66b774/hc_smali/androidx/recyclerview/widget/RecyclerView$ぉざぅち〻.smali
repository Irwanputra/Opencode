.class public Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3049\u3056\u3045\u3061\u303b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public げつ〴ぬぐ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3056\u3045\u3061\u303b$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ:Landroid/util/SparseArray;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public 〺つふすそ(JJ)J
    .registers 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_7

    return-wide p3

    :cond_7
    const-wide/16 v0, 0x4

    div-long/2addr p1, v0

    const-wide/16 v2, 0x3

    mul-long p1, p1, v2

    div-long/2addr p3, v0

    add-long/2addr p3, p1

    return-wide p3
.end method

.method public final げつ〴ぬぐ(I)Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    if-nez v0, :cond_14

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;-><init>()V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_14
    return-object v0
.end method
