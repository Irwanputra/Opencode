.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field public げつ〴ぬぐ:Landroid/animation/FloatEvaluator;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/animation/FloatEvaluator;

    invoke-direct {p1}, Landroid/animation/FloatEvaluator;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/ぺぁあねじ;->げつ〴ぬぐ:Landroid/animation/FloatEvaluator;

    return-void
.end method


# virtual methods
.method public evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    check-cast p2, Ljava/lang/Float;

    check-cast p3, Ljava/lang/Float;

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/ぺぁあねじ;->げつ〴ぬぐ:Landroid/animation/FloatEvaluator;

    invoke-virtual {v0, p1, p2, p3}, Landroid/animation/FloatEvaluator;->evaluate(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const p2, 0x3dcccccd    # 0.1f

    cmpg-float p2, p1, p2

    if-gez p2, :cond_16

    const/4 p1, 0x0

    :cond_16
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
