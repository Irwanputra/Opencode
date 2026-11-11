.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final いいにぽつ:[F

.field public static final てぜきぽく:[F

.field public static final ぺぁあねじ:[I

.field public static final ぺふねづ〺:[I


# instance fields
.field public 〳ぜぞぜべっ:Landroid/graphics/Paint;

.field public final 〺つふすそ:Landroid/graphics/Paint;

.field public final ぁごぐすすぃ:Landroid/graphics/Path;

.field public final くし〴〺ぅ:Landroid/graphics/Paint;

.field public final げつ〴ぬぐ:Landroid/graphics/Paint;

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const/4 v0, 0x3

    new-array v1, v0, [I

    sput-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->ぺぁあねじ:[I

    new-array v0, v0, [F

    fill-array-data v0, :array_1a

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->いいにぽつ:[F

    const/4 v0, 0x4

    new-array v1, v0, [I

    sput-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->ぺふねづ〺:[I

    new-array v0, v0, [F

    fill-array-data v0, :array_24

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->てぜきぽく:[F

    return-void

    nop

    :array_1a
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_24
    .array-data 4
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->ぁごぐすすぃ:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(I)V
    .registers 3

    const/16 v0, 0x44

    invoke-static {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ(II)I

    move-result v0

    iput v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->びぐびあび:I

    const/16 v0, 0x14

    invoke-static {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ(II)I

    move-result v0

    iput v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->づざかべべ:I

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ(II)I

    move-result p1

    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->なぎぱいぢぎ:I

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method
