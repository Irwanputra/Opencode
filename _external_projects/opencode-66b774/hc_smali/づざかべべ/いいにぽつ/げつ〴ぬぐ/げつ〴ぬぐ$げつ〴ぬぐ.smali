.class public final Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/いいにぽつ/げつ〴ぬぐ/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "L\u3065\u3056\u304b\u3079\u3079/\u3044\u3044\u306b\u307d\u3064/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d<",
        "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u3049\u3032\u306a\u3071\u307d\u305f/\u303a\u3064\u3075\u3059\u305d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .registers 3

    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;

    .line 1
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V

    return-void
.end method
