.class public abstract Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u3049\u3032\u306a\u3071\u307d\u305f"
.end annotation


# static fields
.field public static final は〲ぱなで:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

.field public 〺つふすそ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ">;"
        }
    .end annotation
.end field

.field public ぁごぐすすぃ:I

.field public いいにぽつ:I

.field public ぇぬぎばつ:I

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:Z

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Landroid/view/View;

.field public ざとぅぼこ〺:Landroidx/recyclerview/widget/RecyclerView;

.field public づざかべべ:J

.field public てぜきぽく:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:I

.field public のぷのちつ:I

.field public びぐびあび:I

.field public へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

.field public ぺぁあねじ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

.field public ぺふねづ〺:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->は〲ぱなで:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび:I

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺぁあねじ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺:Ljava/util/List;

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->てぜきぽく:Ljava/util/List;

    const/4 v2, 0x0

    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ:I

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぇぬぎばつ:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻:I

    if-eqz p1, :cond_29

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    return-void

    :cond_29
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "itemView may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "ViewHolder"

    goto :goto_15

    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :goto_15
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{"

    invoke-static {v0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " position="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " id="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", oldPos="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", pLpos:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ()Z

    move-result v0

    if-eqz v0, :cond_6e

    const-string v0, " scrap "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    if-eqz v0, :cond_69

    const-string v0, "[changeScrap]"

    goto :goto_6b

    :cond_69
    const-string v0, "[attachedScrap]"

    :goto_6b
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v0

    if-eqz v0, :cond_79

    const-string v0, " invalid"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_79
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ()Z

    move-result v0

    if-nez v0, :cond_84

    const-string v0, " unbound"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    :cond_84
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v0, v0, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_8d

    const/4 v0, 0x1

    goto :goto_8e

    :cond_8d
    const/4 v0, 0x0

    :goto_8e
    if-eqz v0, :cond_95

    const-string v0, " update"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_95
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v0

    if-eqz v0, :cond_a0

    const-string v0, " removed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v0

    if-eqz v0, :cond_ab

    const-string v0, " ignored"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_ab
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず()Z

    move-result v0

    if-eqz v0, :cond_b6

    const-string v0, " tmpDetached"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->てぜきぽく()Z

    move-result v0

    if-nez v0, :cond_d3

    const-string v0, " not recyclable("

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    :cond_d3
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit16 v0, v0, 0x200

    if-nez v0, :cond_df

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v0

    if-eqz v0, :cond_e0

    :cond_df
    const/4 v2, 0x1

    :cond_e0
    if-eqz v2, :cond_e7

    const-string v0, " undefined adapter position"

    .line 4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_f4

    const-string v0, " no parent"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f4
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〳ぜぞぜべっ(I)Z
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_7

    const/4 p1, 0x1

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    return p1
.end method

.method public 〺つふすそ(I)V
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    return-void
.end method

.method public ぁごぐすすぃ()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_17

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺:Ljava/util/List;

    if-eqz v0, :cond_14

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_11

    goto :goto_14

    :cond_11
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->てぜきぽく:Ljava/util/List;

    return-object v0

    :cond_14
    :goto_14
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->は〲ぱなで:Ljava/util/List;

    return-object v0

    :cond_17
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->は〲ぱなで:Ljava/util/List;

    return-object v0
.end method

.method public いいにぽつ()Z
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_7

    goto :goto_8

    :cond_7
    const/4 v1, 0x0

    :goto_8
    return v1
.end method

.method public ぇぬぎばつ()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public ぉざぅち〻(IZ)V
    .registers 5

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび:I

    :cond_9
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    if-ne v0, v1, :cond_11

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    :cond_11
    if-eqz p2, :cond_18

    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    add-int/2addr p2, p1

    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    :cond_18
    iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    add-int/2addr p2, p1

    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_30

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 p2, 0x1

    iput-boolean p2, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ:Z

    :cond_30
    return-void
.end method

.method public おぐぴう〸ず()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public くし〴〺ぅ()V
    .registers 2

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    return-void
.end method

.method public げつ〴ぬぐ(Ljava/lang/Object;)V
    .registers 4

    const/16 v0, 0x400

    if-nez p1, :cond_8

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    goto :goto_23

    :cond_8
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/2addr v0, v1

    if-nez v0, :cond_23

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺:Ljava/util/List;

    if-nez v0, :cond_1e

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->てぜきぽく:Ljava/util/List;

    .line 2
    :cond_1e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_23
    :goto_23
    return-void
.end method

.method public final ごづごきえ(Z)V
    .registers 4

    const/4 v0, 0x1

    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ:I

    if-eqz p1, :cond_7

    sub-int/2addr v1, v0

    goto :goto_8

    :cond_7
    add-int/2addr v1, v0

    :goto_8
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ:I

    if-gez v1, :cond_20

    const/4 p1, 0x0

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    goto :goto_34

    :cond_20
    if-nez p1, :cond_2b

    if-ne v1, v0, :cond_2b

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    or-int/lit8 p1, p1, 0x10

    :goto_28
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    goto :goto_34

    :cond_2b
    if-eqz p1, :cond_34

    if-nez v1, :cond_34

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 p1, p1, -0x11

    goto :goto_28

    :cond_34
    :goto_34
    return-void
.end method

.method public ざっざへづ()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public ざとぅぼこ〺()V
    .registers 5

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    const/4 v1, -0x1

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび:I

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺぁあねじ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺:Ljava/util/List;

    if-eqz v2, :cond_1c

    invoke-interface {v2}, Ljava/util/List;->clear()V

    :cond_1c
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    .line 2
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぇぬぎばつ:I

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻:I

    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    return-void
.end method

.method public final づざかべべ()I
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざとぅぼこ〺:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_6

    const/4 v0, -0x1

    return v0

    :cond_6
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->せづっ〸ちね(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)I

    move-result v0

    return v0
.end method

.method public final てぜきぽく()Z
    .registers 5

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-nez v0, :cond_19

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 1
    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v1, :cond_15

    invoke-virtual {v0}, Landroid/view/View;->hasTransientState()Z

    move-result v0

    goto :goto_16

    :cond_15
    const/4 v0, 0x0

    :goto_16
    if-nez v0, :cond_19

    const/4 v2, 0x1

    :cond_19
    return v2
.end method

.method public でどあくず()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public final なぎぱいぢぎ()I
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    :cond_7
    return v0
.end method

.method public のぷのちつ()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public は〲ぱなで(II)V
    .registers 5

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    xor-int/lit8 v1, p2, -0x1

    and-int/2addr v0, v1

    and-int/2addr p1, p2

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    return-void
.end method

.method public びぐびあび()V
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    return-void
.end method

.method public へぬ〴づぞ()Z
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public ぺぁあねじ()Z
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざとぅぼこ〺:Landroidx/recyclerview/widget/RecyclerView;

    if-eq v0, v1, :cond_14

    const/4 v0, 0x1

    goto :goto_15

    :cond_14
    const/4 v0, 0x0

    :goto_15
    return v0
.end method

.method public ぺふねづ〺()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method
