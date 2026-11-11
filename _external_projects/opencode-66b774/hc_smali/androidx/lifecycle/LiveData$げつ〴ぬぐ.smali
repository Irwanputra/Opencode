.class public abstract Landroidx/lifecycle/LiveData$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Lづざかべべ/のぷのちつ/のぷのちつ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u306e\u3077\u306e\u3061\u3064<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final synthetic びぐびあび:Landroidx/lifecycle/LiveData;


# virtual methods
.method public 〳ぜぞぜべっ(Z)V
    .registers 6

    iget-boolean v0, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〺つふすそ:Z

    if-ne p1, v0, :cond_5

    return-void

    :cond_5
    iput-boolean p1, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〺つふすそ:Z

    iget-object v0, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->びぐびあび:Landroidx/lifecycle/LiveData;

    iget v1, v0, Landroidx/lifecycle/LiveData;->くし〴〺ぅ:I

    const/4 v2, 0x1

    if-nez v1, :cond_10

    const/4 v3, 0x1

    goto :goto_11

    :cond_10
    const/4 v3, 0x0

    :goto_11
    if-eqz p1, :cond_14

    goto :goto_15

    :cond_14
    const/4 v2, -0x1

    :goto_15
    add-int/2addr v1, v2

    iput v1, v0, Landroidx/lifecycle/LiveData;->くし〴〺ぅ:I

    if-eqz v3, :cond_1f

    if-eqz p1, :cond_1f

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->びぐびあび()V

    :cond_1f
    iget-object p1, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->びぐびあび:Landroidx/lifecycle/LiveData;

    iget v0, p1, Landroidx/lifecycle/LiveData;->くし〴〺ぅ:I

    if-nez v0, :cond_2c

    iget-boolean v0, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〺つふすそ:Z

    if-nez v0, :cond_2c

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->づざかべべ()V

    :cond_2c
    iget-boolean p1, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〺つふすそ:Z

    if-eqz p1, :cond_35

    iget-object p1, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->びぐびあび:Landroidx/lifecycle/LiveData;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/LiveData;->くし〴〺ぅ(Landroidx/lifecycle/LiveData$げつ〴ぬぐ;)V

    :cond_35
    return-void
.end method

.method public abstract いいにぽつ()Z
.end method

.method public ぺぁあねじ()V
    .registers 1

    return-void
.end method
