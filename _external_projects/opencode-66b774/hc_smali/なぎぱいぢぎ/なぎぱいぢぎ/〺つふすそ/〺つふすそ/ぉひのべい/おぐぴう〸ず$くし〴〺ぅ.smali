.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# static fields
.field public static final 〳ぜぞぜべっ:Landroid/graphics/RectF;


# instance fields
.field public 〺つふすそ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public ぁごぐすすぃ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public くし〴〺ぅ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public づざかべべ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public なぎぱいぢぎ:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public びぐびあび:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->〳ぜぞぜべっ:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(FFFF)V
    .registers 5

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$づざかべべ;-><init>()V

    .line 1
    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->〺つふすそ:F

    .line 2
    iput p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->くし〴〺ぅ:F

    .line 3
    iput p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->びぐびあび:F

    .line 4
    iput p4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->づざかべべ:F

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/graphics/Matrix;Landroid/graphics/Path;)V
    .registers 8

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$づざかべべ;->げつ〴ぬぐ:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    invoke-virtual {p2, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->〳ぜぞぜべっ:Landroid/graphics/RectF;

    .line 1
    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->〺つふすそ:F

    .line 2
    iget v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->くし〴〺ぅ:F

    .line 3
    iget v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->びぐびあび:F

    .line 4
    iget v4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->づざかべべ:F

    .line 5
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 6
    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->なぎぱいぢぎ:F

    .line 7
    iget v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$くし〴〺ぅ;->ぁごぐすすぃ:F

    const/4 v3, 0x0

    .line 8
    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {p2, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    return-void
.end method
