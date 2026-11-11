.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final synthetic ぁごぐすすぃ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

.field public くし〴〺ぅ:Z

.field public げつ〴ぬぐ:I

.field public づざかべべ:Z

.field public なぎぱいぢぎ:[I

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V
    .registers 2

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 3

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    const/high16 v1, -0x80000000

    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->びぐびあび:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->づざかべべ:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->なぎぱいぢぎ:[I

    if-eqz v1, :cond_15

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    :cond_15
    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_d

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    goto :goto_15

    :cond_d
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    :goto_15
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    return-void
.end method
