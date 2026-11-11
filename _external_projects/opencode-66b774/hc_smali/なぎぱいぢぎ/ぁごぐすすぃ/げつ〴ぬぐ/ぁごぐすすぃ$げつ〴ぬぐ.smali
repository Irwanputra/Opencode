.class public Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;
.super Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public なぎぱいぢぎ:F


# direct methods
.method public constructor <init>(FF)V
    .registers 3

    invoke-direct {p0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;-><init>()V

    iput p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput p2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:F

    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    iput-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/Class;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:Z

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .registers 4

    .line 1
    new-instance v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;

    .line 2
    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    .line 3
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:F

    invoke-direct {v0, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>(FF)V

    .line 4
    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    .line 5
    iput-object v1, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public 〺つふすそ()Ljava/lang/Object;
    .registers 2

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 4

    if-eqz p1, :cond_15

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Float;

    if-ne v0, v1, :cond_15

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:Z

    :cond_15
    return-void
.end method

.method public げつ〴ぬぐ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;
    .registers 4

    .line 1
    new-instance v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;

    .line 2
    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    .line 3
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:F

    invoke-direct {v0, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>(FF)V

    .line 4
    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    .line 5
    iput-object v1, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    return-object v0
.end method
