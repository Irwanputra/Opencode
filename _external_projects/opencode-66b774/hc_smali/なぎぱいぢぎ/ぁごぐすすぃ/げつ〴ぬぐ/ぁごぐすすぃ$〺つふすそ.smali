.class public Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;
.super Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public なぎぱいぢぎ:I


# direct methods
.method public constructor <init>(FI)V
    .registers 3

    invoke-direct {p0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;-><init>()V

    iput p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput p2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    iput-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/Class;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:Z

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .registers 4

    .line 1
    new-instance v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    .line 2
    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    .line 3
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    invoke-direct {v0, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;-><init>(FI)V

    .line 4
    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    .line 5
    iput-object v1, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public 〺つふすそ()Ljava/lang/Object;
    .registers 2

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 4

    if-eqz p1, :cond_15

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Integer;

    if-ne v0, v1, :cond_15

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:Z

    :cond_15
    return-void
.end method

.method public げつ〴ぬぐ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;
    .registers 4

    .line 1
    new-instance v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    .line 2
    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    .line 3
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    invoke-direct {v0, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;-><init>(FI)V

    .line 4
    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    .line 5
    iput-object v1, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    return-object v0
.end method
