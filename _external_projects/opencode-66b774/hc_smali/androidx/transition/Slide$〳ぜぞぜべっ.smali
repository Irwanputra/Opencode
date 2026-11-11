.class public abstract Landroidx/transition/Slide$〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/transition/Slide$ぁごぐすすぃ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Slide;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u3033\u305c\u305e\u305c\u3079\u3063"
.end annotation


# direct methods
.method public constructor <init>(Landroidx/transition/Slide$げつ〴ぬぐ;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/ViewGroup;Landroid/view/View;)F
    .registers 3

    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result p1

    return p1
.end method
