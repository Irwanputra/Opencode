.class public final Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;,
        Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static ぁごぐすすぃ:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3047\u306c\u304e\u3070\u3064/\u3073\u3050\u3073\u3042\u3073/\u306e\u3077\u306e\u3061\u3064$\u304f\u3057\u3034\u303a\u3045;",
            ">;"
        }
    .end annotation
.end field

.field public static final なぎぱいぢぎ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3047\u306c\u304e\u3070\u3064/\u3073\u3050\u3073\u3042\u3073/\u306e\u3077\u306e\u3061\u3064;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:J

.field public づざかべべ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3047\u306c\u304e\u3070\u3064/\u3073\u3050\u3073\u3042\u3073/\u306e\u3077\u306e\u3061\u3064$\u304f\u3057\u3034\u303a\u3045;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:J


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/ThreadLocal;

    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->ぁごぐすすぃ:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 9

    const-wide/16 v0, 0x0

    :try_start_2
    const-string v2, "RV Prefetch"

    invoke-static {v2}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;)V

    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2
    :try_end_d
    .catchall {:try_start_2 .. :try_end_d} :catchall_4f

    if-eqz v2, :cond_15

    :goto_f
    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->くし〴〺ぅ:J

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    return-void

    :cond_15
    :try_start_15
    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move-wide v4, v0

    :goto_1d
    if-ge v3, v2, :cond_38

    iget-object v6, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getWindowVisibility()I

    move-result v7

    if-nez v7, :cond_35

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getDrawingTime()J

    move-result-wide v6

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    :cond_35
    add-int/lit8 v3, v3, 0x1

    goto :goto_1d

    :cond_38
    cmp-long v2, v4, v0

    if-nez v2, :cond_3d

    goto :goto_f

    :cond_3d
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    iget-wide v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->びぐびあび:J

    add-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ(J)V
    :try_end_49
    .catchall {:try_start_15 .. :try_end_49} :catchall_4f

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->くし〴〺ぅ:J

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    return-void

    :catchall_4f
    move-exception v2

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->くし〴〺ぅ:J

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    goto :goto_57

    :goto_56
    throw v2

    :goto_57
    goto :goto_56
.end method

.method public 〺つふすそ(J)V
    .registers 16

    .line 1
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_9
    if-ge v2, v0, :cond_26

    iget-object v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getWindowVisibility()I

    move-result v5

    if-nez v5, :cond_23

    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    invoke-virtual {v5, v4, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView;Z)V

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    iget v4, v4, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    add-int/2addr v3, v4

    :cond_23
    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_26
    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2d
    const/4 v4, 0x1

    if-ge v2, v0, :cond_8f

    iget-object v5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getWindowVisibility()I

    move-result v6

    if-eqz v6, :cond_3f

    goto :goto_8c

    :cond_3f
    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    iget v7, v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->げつ〴ぬぐ:I

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    iget v8, v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->〺つふすそ:I

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    add-int/2addr v8, v7

    const/4 v7, 0x0

    :goto_4f
    iget v9, v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    mul-int/lit8 v9, v9, 0x2

    if-ge v7, v9, :cond_8c

    iget-object v9, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-lt v3, v9, :cond_68

    new-instance v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;

    invoke-direct {v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;-><init>()V

    iget-object v10, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_70

    :cond_68
    iget-object v9, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;

    :goto_70
    iget-object v10, v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    add-int/lit8 v11, v7, 0x1

    aget v11, v10, v11

    if-gt v11, v8, :cond_7a

    const/4 v12, 0x1

    goto :goto_7b

    :cond_7a
    const/4 v12, 0x0

    :goto_7b
    iput-boolean v12, v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->げつ〴ぬぐ:Z

    iput v8, v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->〺つふすそ:I

    iput v11, v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->くし〴〺ぅ:I

    iput-object v5, v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    aget v10, v10, v7

    iput v10, v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->づざかべべ:I

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v7, v7, 0x2

    goto :goto_4f

    :cond_8c
    :goto_8c
    add-int/lit8 v2, v2, 0x1

    goto :goto_2d

    :cond_8f
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    sget-object v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->ぁごぐすすぃ:Ljava/util/Comparator;

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    .line 2
    :goto_97
    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_133

    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;

    iget-object v3, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v3, :cond_ad

    goto/16 :goto_133

    .line 3
    :cond_ad
    iget-boolean v5, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->げつ〴ぬぐ:Z

    if-eqz v5, :cond_b7

    const-wide v5, 0x7fffffffffffffffL

    goto :goto_b8

    :cond_b7
    move-wide v5, p1

    :goto_b8
    iget v7, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->づざかべべ:I

    invoke-virtual {p0, v3, v7, v5, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView;IJ)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v3

    if-eqz v3, :cond_124

    iget-object v5, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_124

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ()Z

    move-result v5

    if-eqz v5, :cond_124

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v5

    if-nez v5, :cond_124

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    if-nez v3, :cond_db

    goto :goto_124

    .line 4
    :cond_db
    iget-boolean v5, v3, Landroidx/recyclerview/widget/RecyclerView;->どぇぞほだ:Z

    if-eqz v5, :cond_ea

    iget-object v5, v3, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〳ぜぞぜべっ()I

    move-result v5

    if-eqz v5, :cond_ea

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ()V

    :cond_ea
    iget-object v5, v3, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    invoke-virtual {v5, v3, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView;Z)V

    iget v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    if-eqz v6, :cond_124

    :try_start_f3
    const-string v6, "RV Nested Prefetch"

    invoke-static {v6}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;)V

    iget-object v6, v3, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iget-object v7, v3, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 5
    iput v4, v6, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->びぐびあび:I

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v7

    iput v7, v6, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->づざかべべ:I

    iput-boolean v1, v6, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    iput-boolean v1, v6, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〳ぜぞぜべっ:Z

    iput-boolean v1, v6, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぺぁあねじ:Z

    const/4 v6, 0x0

    .line 6
    :goto_10b
    iget v7, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    mul-int/lit8 v7, v7, 0x2

    if-ge v6, v7, :cond_11b

    iget-object v7, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    aget v7, v7, v6

    invoke-virtual {p0, v3, v7, p1, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView;IJ)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
    :try_end_118
    .catchall {:try_start_f3 .. :try_end_118} :catchall_11f

    add-int/lit8 v6, v6, 0x2

    goto :goto_10b

    :cond_11b
    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    goto :goto_124

    :catchall_11f
    move-exception p1

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    throw p1

    .line 7
    :cond_124
    :goto_124
    iput-boolean v1, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->げつ〴ぬぐ:Z

    iput v1, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->〺つふすそ:I

    iput v1, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->くし〴〺ぅ:I

    const/4 v3, 0x0

    iput-object v3, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    iput v1, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$くし〴〺ぅ;->づざかべべ:I

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_97

    :cond_133
    :goto_133
    return-void
.end method

.method public final くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView;IJ)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
    .registers 10

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〳ぜぞぜべっ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v0, :cond_23

    iget-object v3, p1, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぁごぐすすぃ(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v3

    iget v4, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-ne v4, p2, :cond_20

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v3

    if-nez v3, :cond_20

    const/4 v0, 0x1

    goto :goto_24

    :cond_20
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_23
    const/4 v0, 0x0

    :goto_24
    if-eqz v0, :cond_28

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_28
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    :try_start_2a
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->ごまけがぢは()V

    invoke-virtual {v0, p2, v1, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺふねづ〺(IZJ)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object p2

    if-eqz p2, :cond_48

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ()Z

    move-result p3

    if-eqz p3, :cond_45

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result p3

    if-nez p3, :cond_45

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v0, p3}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ(Landroid/view/View;)V

    goto :goto_48

    :cond_45
    invoke-virtual {v0, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Z)V
    :try_end_48
    .catchall {:try_start_2a .. :try_end_48} :catchall_4c

    :cond_48
    :goto_48
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->こ〲しでおか(Z)V

    return-object p2

    :catchall_4c
    move-exception p2

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->こ〲しでおか(Z)V

    goto :goto_52

    :goto_51
    throw p2

    :goto_52
    goto :goto_51
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 9

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_17

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ;->くし〴〺ぅ:J

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_17
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    .line 1
    iput p2, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->げつ〴ぬぐ:I

    iput p3, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->〺つふすそ:I

    return-void
.end method
