.class public Lづざかべべ/のぷのちつ/てぜきぽく;
.super Landroidx/lifecycle/LiveData;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/LiveData<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/lifecycle/LiveData;-><init>()V

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "setValue"

    .line 1
    invoke-static {v0}, Landroidx/lifecycle/LiveData;->げつ〴ぬぐ(Ljava/lang/String;)V

    iget v0, p0, Landroidx/lifecycle/LiveData;->なぎぱいぢぎ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/lifecycle/LiveData;->なぎぱいぢぎ:I

    iput-object p1, p0, Landroidx/lifecycle/LiveData;->びぐびあび:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->くし〴〺ぅ(Landroidx/lifecycle/LiveData$げつ〴ぬぐ;)V

    return-void
.end method
