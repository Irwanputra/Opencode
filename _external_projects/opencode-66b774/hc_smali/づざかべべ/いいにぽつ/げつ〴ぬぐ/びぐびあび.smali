.class public Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/graphics/Rect;

.field public final くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:Landroid/graphics/Rect;

.field public final びぐびあび:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/〺つふすそ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3044\u3044\u306b\u307d\u3064/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLづざかべべ/いいにぽつ/げつ〴ぬぐ/〺つふすそ;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "L\u3065\u3056\u304b\u3079\u3079/\u3044\u3044\u306b\u307d\u3064/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Landroid/graphics/Rect;

    iput-boolean p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Z

    iput-object p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->びぐびあび:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Rect;

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Landroid/graphics/Rect;

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->びぐびあび:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/〺つふすそ;

    check-cast v2, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v2, p1, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Object;Landroid/graphics/Rect;)V

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->びぐびあび:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/〺つふすそ;

    check-cast p1, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {p1, p2, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Object;Landroid/graphics/Rect;)V

    iget p1, v0, Landroid/graphics/Rect;->top:I

    iget p2, v1, Landroid/graphics/Rect;->top:I

    const/4 v2, -0x1

    if-ge p1, p2, :cond_1a

    return v2

    :cond_1a
    const/4 v3, 0x1

    if-le p1, p2, :cond_1e

    return v3

    :cond_1e
    iget p1, v0, Landroid/graphics/Rect;->left:I

    iget p2, v1, Landroid/graphics/Rect;->left:I

    if-ge p1, p2, :cond_2a

    iget-boolean p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Z

    if-eqz p1, :cond_29

    const/4 v2, 0x1

    :cond_29
    return v2

    :cond_2a
    if-le p1, p2, :cond_33

    iget-boolean p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Z

    if-eqz p1, :cond_31

    goto :goto_32

    :cond_31
    const/4 v2, 0x1

    :goto_32
    return v2

    :cond_33
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    iget p2, v1, Landroid/graphics/Rect;->bottom:I

    if-ge p1, p2, :cond_3a

    return v2

    :cond_3a
    if-le p1, p2, :cond_3d

    return v3

    :cond_3d
    iget p1, v0, Landroid/graphics/Rect;->right:I

    iget p2, v1, Landroid/graphics/Rect;->right:I

    if-ge p1, p2, :cond_49

    iget-boolean p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Z

    if-eqz p1, :cond_48

    const/4 v2, 0x1

    :cond_48
    return v2

    :cond_49
    if-le p1, p2, :cond_52

    iget-boolean p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:Z

    if-eqz p1, :cond_50

    goto :goto_51

    :cond_50
    const/4 v2, 0x1

    :goto_51
    return v2

    :cond_52
    const/4 p1, 0x0

    return p1
.end method
