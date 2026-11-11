.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ$〺つふすそ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ$〺つふすそ;

.field public くし〴〺ぅ:Landroid/animation/ValueAnimator;

.field public final げつ〴ぬぐ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u306a\u3076\u3072\u305b\u304c/\u306a\u304e\u3071\u3044\u3062\u304e$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:Landroid/animation/Animator$AnimatorListener;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ$〺つふすそ;

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/animation/ValueAnimator;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;->びぐびあび:Landroid/animation/Animator$AnimatorListener;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ([ILandroid/animation/ValueAnimator;)V
    .registers 4

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ$〺つふすそ;

    invoke-direct {v0, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ$〺つふすそ;-><init>([ILandroid/animation/ValueAnimator;)V

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;->びぐびあび:Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {p2, p1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
