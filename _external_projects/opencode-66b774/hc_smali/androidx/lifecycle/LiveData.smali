.class public abstract Landroidx/lifecycle/LiveData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/LiveData$げつ〴ぬぐ;,
        Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final ぺぁあねじ:Ljava/lang/Object;


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u306e\u3077\u306e\u3061\u3064<",
            "-TT;>;",
            "Landroidx/lifecycle/LiveData<",
            "TT;>.\u3052\u3064\u3034\u306c\u3050;>;"
        }
    .end annotation
.end field

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Ljava/lang/Object;

.field public volatile づざかべべ:Ljava/lang/Object;

.field public なぎぱいぢぎ:I

.field public volatile びぐびあび:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/LiveData;->ぺぁあねじ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->げつ〴ぬぐ:Ljava/lang/Object;

    new-instance v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    invoke-direct {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/LiveData;->くし〴〺ぅ:I

    sget-object v0, Landroidx/lifecycle/LiveData;->ぺぁあねじ:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->びぐびあび:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->づざかべべ:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/lifecycle/LiveData;->なぎぱいぢぎ:I

    return-void
.end method

.method public static げつ〴ぬぐ(Ljava/lang/String;)V
    .registers 4

    invoke-static {}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ()Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v0

    .line 1
    iget-object v0, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    invoke-virtual {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_d

    return-void

    .line 2
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot invoke "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " on a background"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " thread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final 〺つふすそ(Landroidx/lifecycle/LiveData$げつ〴ぬぐ;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>.\u3052\u3064\u3034\u306c\u3050;)V"
        }
    .end annotation

    iget-boolean v0, p1, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〺つふすそ:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->いいにぽつ()Z

    move-result v0

    if-nez v0, :cond_10

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〳ぜぞぜべっ(Z)V

    return-void

    :cond_10
    iget v0, p1, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v1, p0, Landroidx/lifecycle/LiveData;->なぎぱいぢぎ:I

    if-lt v0, v1, :cond_17

    return-void

    :cond_17
    iput v1, p1, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object p1, p1, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/のぷのちつ;

    iget-object v0, p0, Landroidx/lifecycle/LiveData;->びぐびあび:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lづざかべべ/のぷのちつ/のぷのちつ;->げつ〴ぬぐ(Ljava/lang/Object;)V

    return-void
.end method

.method public くし〴〺ぅ(Landroidx/lifecycle/LiveData$げつ〴ぬぐ;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>.\u3052\u3064\u3034\u306c\u3050;)V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/lifecycle/LiveData;->ぁごぐすすぃ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->〳ぜぞぜべっ:Z

    return-void

    :cond_8
    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->ぁごぐすすぃ:Z

    :cond_a
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->〳ぜぞぜべっ:Z

    if-eqz p1, :cond_14

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->〺つふすそ(Landroidx/lifecycle/LiveData$げつ〴ぬぐ;)V

    const/4 p1, 0x0

    goto :goto_33

    :cond_14
    iget-object v1, p0, Landroidx/lifecycle/LiveData;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    invoke-virtual {v1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ()Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;

    move-result-object v1

    :cond_1a
    invoke-virtual {v1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-virtual {v1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;

    invoke-virtual {p0, v2}, Landroidx/lifecycle/LiveData;->〺つふすそ(Landroidx/lifecycle/LiveData$げつ〴ぬぐ;)V

    iget-boolean v2, p0, Landroidx/lifecycle/LiveData;->〳ぜぞぜべっ:Z

    if-eqz v2, :cond_1a

    :cond_33
    :goto_33
    iget-boolean v1, p0, Landroidx/lifecycle/LiveData;->〳ぜぞぜべっ:Z

    if-nez v1, :cond_a

    iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->ぁごぐすすぃ:Z

    return-void
.end method

.method public づざかべべ()V
    .registers 1

    return-void
.end method

.method public なぎぱいぢぎ(Lづざかべべ/のぷのちつ/のぷのちつ;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u306e\u3077\u306e\u3061\u3064<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "removeObserver"

    invoke-static {v0}, Landroidx/lifecycle/LiveData;->げつ〴ぬぐ(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/LiveData;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    invoke-virtual {v0, p1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->びぐびあび(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;

    if-nez p1, :cond_10

    return-void

    :cond_10
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->ぺぁあねじ()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〳ぜぞぜべっ(Z)V

    return-void
.end method

.method public びぐびあび()V
    .registers 1

    return-void
.end method
