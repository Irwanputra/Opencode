.class public Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:F

.field public final 〺つふすそ:Landroid/graphics/Paint;

.field public ぁごぐすすぃ:F

.field public いいにぽつ:I

.field public ぇぬぎばつ:F

.field public ぉざぅち〻:F

.field public おぐぴう〸ず:Landroid/graphics/Path;

.field public final くし〴〺ぅ:Landroid/graphics/Paint;

.field public final げつ〴ぬぐ:Landroid/graphics/RectF;

.field public ごづごきえ:I

.field public ざっざへづ:I

.field public ざとぅぼこ〺:I

.field public づざかべべ:F

.field public てぜきぽく:F

.field public なぎぱいぢぎ:F

.field public のぷのちつ:F

.field public は〲ぱなで:I

.field public final びぐびあび:Landroid/graphics/Paint;

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:[I

.field public ぺふねづ〺:F


# direct methods
.method public constructor <init>()V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->びぐびあび:Landroid/graphics/Paint;

    const/4 v3, 0x0

    iput v3, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    iput v3, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    iput v3, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    const/high16 v3, 0x40a00000    # 5.0f

    iput v3, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    const/16 v3, 0xff

    iput v3, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    sget-object v3, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Z)V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->へぬ〴づぞ:Z

    if-eq v0, p1, :cond_6

    iput-boolean p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->へぬ〴づぞ:Z

    :cond_6
    return-void
.end method

.method public げつ〴ぬぐ(I)V
    .registers 3

    iput p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->いいにぽつ:I

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺぁあねじ:[I

    aget p1, v0, p1

    iput p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざっざへづ:I

    return-void
.end method
