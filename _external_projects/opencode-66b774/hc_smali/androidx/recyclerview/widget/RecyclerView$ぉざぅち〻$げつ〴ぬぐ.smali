.class public Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:J

.field public final げつ〴ぬぐ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:J


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    const/4 v0, 0x5

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->〺つふすそ:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:J

    iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->びぐびあび:J

    return-void
.end method
